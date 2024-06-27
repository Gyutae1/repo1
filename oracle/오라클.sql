-- ���� �ּ�
/* ���� �ּ� */
SELECT
    *   -- ��� �÷�(��)
FROM
    emp; -- ;�� ;���̸� ��������ش�
-- sql developer �ڵ� ���� ����Ű : ctrl + F7
SELECT
    empno,  -- ��ȸ�ϰ� ���� �÷� ���
    ename,
    deptno
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- ���� ���� ����Ű : ctrl + shift + d

-- distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�.
select distinct deptno from emp;
select distinct job from emp;

select deptno,job from emp;
-- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ°� �����Ѵ�.
select distinct deptno,job from emp;

--  null�� �����ϸ� ������ null�̴�.
select ename, sal, sal*12+comm, comm from emp;
-- �÷��� ��Ī ���
-- " ��������
-- as ��������
-- ��Ī�ȿ� ���Ⱑ �ִ°�� " ���� �Ұ�
-- �����ϸ� ���⺸�� _�� ����
select ename, sal, sal*12+comm as new_SAL, comm from emp;

-- order by : �ش� �÷����� ����
-- �������� : asc ��������
-- �������� : desc
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by : ù��°�ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
select * from emp
order by deptno asc, sal desc;

select distinct job from emp
order by job desc;

select * from emp
where deptno = 30;

select * from emp
where empno = 7782;

select * from emp
where sal > 2000;

select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where deptno = 30 and job = 'CLERK';

select * from emp
where (deptno = 30 or deptno=20) and job = 'CLERK';

select * from emp
where sal >= 2000 and sal < 3000;

select * from emp
where sal*12 = 36000;

select * from emp
--where sal != 3000; �ؿ� <> �� ����
where sal <> 3000;


select * from emp
where not(sal >= 2000 and sal < 3000);

select * from emp
where job not in ('MANAGER','SALESMAN','CLERK');

select * from emp
where sal >= 2000 and sal <=3000;

select * from emp
where sal not between 2000 and 3000;

-- %�� ��ŵ� �������
select * from emp
where ename like 'S%';

select * from emp
where ename like 'A%';

-- _�� �� �ѱ����ε� � ���ڴ� ���� ����

select * from emp
where ename like '_L%';

select * from emp
where ename like '____';

select * from emp
where ename like '%AM%';

select * from emp
where comm <= 400;

select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where comm is not null;

select empno, ename, sal, deptno from emp
-- where deptno in (10,20);
where (deptno = 10 or deptno = 20);

select empno, ename, sal, deptno from emp
where deptno =10
            -- union : �ߺ��� �ڷḦ ��������
    union   -- ���� �ٸ� ���̺� �ִ� ��ȸ ������� �ѹ��� �� �� �ְ� ���ش�
            -- ��, ��ȸ�� �÷��� ����,Ÿ��(int,string ...)�� ���ƾ� �Ѵ�.
select empno, ename, sal, deptno from emp
where deptno =10;

select empno, ename, sal, deptno from emp
where deptno =10
            
    union all   -- union all : �ߺ��� ������� �����ش�.
            
select empno, ename, sal, deptno from emp
where deptno =10;
--125p.
--Q1
select * from emp
where ename like '%S';
--Q2
select empno, ename, job, sal, deptno from emp
where job = 'SALESMAN'
and deptno = 30;
--Q3-1
select empno, ename, job, sal, deptno from emp
where deptno in (20,30)
and sal > 2000;
--Q3-2
select empno, ename, job, sal, deptno from emp
where sal > 2000
and deptno = 20

union all

select empno, ename, job, sal, deptno from emp
where sal > 2000
and deptno = 30;
--Q4
select * from emp
where not (sal >= 2000 and sal <=3000);
--Q5
select empno, ename, sal, deptno from emp
where deptno= 30
and ename like '%E%'
and not (sal >= 1000 and sal <=2000);
--Q6
select * from emp
where comm is null
and mgr is not null
and job in ('MANAGER','CLERK')
and ename not like '_L%';

select ename, upper(ename), lower(ename), initcap(ename) from emp;

-- upper, lower�� ��ҹ��� ���� ���� like�Ҷ� �� ����
select * from emp
where lower(ename) like lower('%Mi%');

select ename, length(ename) from emp
where length(ename) >= 5;

select length('��'), lengthb('��') from dual;

-- substr : ����̵Ǵ� ����, ������ġ, ������ ����
-- ������ ������ �Ⱦ��ų� �ʹ� ũ�� ������ ���
select job,
    substr(job,1,2),
    substr(job,3,3),
    substr(job,5),
    ename,
    substr(job,-3,2),
    length(lower(substr(job,5,100)))
from emp;

select job, replace(job,'A','*') from emp;

select
job,
length(job),
(length(job) / 2),
substr(job,((length(job)+1) / 2),1),
replace(
job,
substr(job,(length(job)+1) / 2, 1),
'*')
from emp;


-- lpad : ����� �Ǵ� ����, ��ü �ڸ���, ä�� ����
-- ä�� ���� ���� �� ���鹮�ڷ� ��� ������ ȿ��
select
    job,
    lpad(job,15),
    lpad(job,4,'#'),
    length(job)
from emp;

select 
    job,length(job),15-length(job)
from emp;

--select
--    rpad(
--      lpad(
--          job,
--          ( 15-(length(job)))/2+length(job),
--          '*'),
--          ( 15-(length(job)))/2+length(lpad(job
--
--    
--from emp;
-- || : ���ڿ� ���ϱ�
select empno || ename || '��'
from emp;

-- trim : �� �� ���� ����
-- �۾� ������ ������ �������� ����
select
    '   a b c      ',
    trim('   a b c      ')
from dual;

-- �ǽ����� 1
select
    '210612-3123456',
    '210612-3******',
    lpad('210612-3123456',8),
    rpad(lpad('210612-3123456',8),14,'*')
from dual;

-- �ǽ����� 2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��

select
    ename,
    lpad(ename,2),
    rpad(lpad(ename,2),length(ename),'*')
from emp;

-- �ǽ� 3
-- �ձ��� �ϳ���
-- length(ename)
select
    ename,
    substr(ename,2),
    lpad(substr(ename,2),length(ename),'*')
from emp;
-- �ǽ� 4
-- �ι�° �۾��� *
    select
        ename,
        lpad(ename,1),
        rpad(lpad(ename,1),2,'*')
        ||
        substr(ename,3,length(ename))
    from emp;
-- �ǽ� 5
-- ��� �۾��� * length(lpad(ename,length(ename)/2+1))-1
    select
        ename,
        lpad(ename,length(ename)/2),
        rpad(lpad(ename,length(ename)/2),length(lpad(ename,length(ename)/2+1)),'*')
        ||
        substr(ename,length(ename)/2+2,length(ename))
    from emp;

select 
    trunc(1234.5678),
    trunc(1234.5678,2),
    trunc(1234.5678,-2),
    trunc(-12.34)

from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
    
from dual;

select
    sysdate,   -- sysdate : ���� ����Ŭ pc�� �ð��� ���ɴϴ�
    sysdate+1, -- ������� pc�� 9�ð� ���� ���� (���� 0�� ���� �ѱ� +9��)
    sysdate-1  -- ��¥ ���� �� �Ϻθ� select�� ǥ�� ��
from dual;

-- �÷��� +�� ������ ��� ���ڷ� ����
-- || ���ڵ� ���ڷ� ����

select to_char(sysdate+9/24, 'YYYY"��"MM"��"DD"��" HH24"��" MI"��" SS"��"') from dual;

select 
    case 
        when
            comm is null
            then
--                'N/A'
                0
        else
--            to_char(comm)
                comm
        end new_comm
from emp;
-- Q2
select empno, ename, sal,
    trunc(sal/21.5,2)as day_pay,
    round(sal/21.5/8,1)as time_pay
from emp;
-- Q3
select empno,ename,
    to_char(hiredate,'YYYY"/"MM"/"DD')as HIREDATE,
--    next_day(add_months(hiredate,3), 2) as r_job_0,
    to_char(add_months(hiredate,3),'YYYY"-"MM"-"DD')as R_JOB,
    case
        when
            comm is null
            then 'N/A'
            else to_char(comm)
            end as comm
from emp;
-- Q4
select empno,ename,
    case
        when mgr is null then ' '
        else to_char(mgr)
    end as MGR,
    case
        when mgr is null then '0000'
        when substr(mgr,0,2) = 75 then '5555'
        when substr(mgr,0,2) = 76 then '6666'
        when substr(mgr,0,2) = 77 then '7777'
        when substr(mgr,0,2) = 78 then '8888'
        else to_char(mgr)
    end as CHG_MGR
from emp;

-- countó�� null�� ���ܵ�
-- count *�� ���� ��
select sum(sal), count(sal),count(*),count(comm) from emp;

select count(*) from emp where ename like '%A%'; -- Ư�� �ܾ ���ִ� ���� ����

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- �μ����� sal�� sum ���� deptno union all �� ��ġ�� 

select sum(sal), avg(sal) from emp
where deptno =10
union all
select sum(sal), avg(sal) from emp
where deptno =20
union all
select sum(sal), avg(sal) from emp
where deptno =30;

-- distinct ó�� �ߺ��� ��������, �Ǵ� �з�����
-- select���� group by�� ���̳� ������ �Լ�(���� �Լ�)
select deptno, avg(sal),sum(sal),count(*) from emp
group by deptno;

select deptno,empno,sum(sal),count(*) from emp
group by deptno,empno;

select deptno,job,count(*)from emp
group by deptno,job

order by deptno, job;

-- having : group by ������ ���ȴ�
-- ���� �Լ��� �������� �ɰ� ���� ��쿡 ���

select deptno, job, avg(sal)
from emp
group by deptno,job
--    having avg(sal)>= 2000;
--    having count(*) >= 2;
    having deptno = 20;
    
select deptno,
trunc(avg(sal))as avg_sal,
max(sal)as max_sal,
min(sal)as min_sal,
count(*)as cnt from emp
group by deptno;

select job,count(*) from emp
group by job
having count(*) >= 3;

select * from dept;

/* 5 */select job, count(*) cnt
/* 1 */from emp
/* 2 */where sal > 1000
/* 3 */group by job
/* 4 */having count(*) >= 3
/* 6 */order by cnt desc;

select emp.ename,/*emp.loc*/ dept.loc, /*deptno*/ emp.deptno
from emp, dept
where emp.deptno = dept.deptno
order by empno;
-- ���̺� �ΰ� �̻� ��ȸ�Ҷ� ���踦 �� �˷���� ���ϴ� ������ ��µȴ�
-- ��ü ���̺� �� - 1 ���� ������ �����ϴ�

select * 
from emp e, dept d
where e.deptno = d.deptno;

select ename, d.* -- *�� �÷��� ���� ���� ��� *�� ���̺��� ��������� �Ѵ�. 
from emp e, dept d
where e.deptno = d.deptno;

select * from salgrade;

select * from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

select * 
from emp join dept
using(deptno)
order by deptno;

select *
from emp join dept on(emp.deptno = dept.deptno);

-- left outer join : ���� ���̺��� ��� ����ϴ°� �������ش�
select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);

-- quiz 1
-- empno, ename, dname, loc ��� :��� 14��

-- quiz 2
-- ���,�̸�,�μ���,�޿������ ��� : ��� 14��

select empno, ename, dname, loc
from emp e, dept d
where e.deptno = d.deptno
;

select e.empno, e.ename, d.dname, s.grade
from emp e,dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <= s.hisal;

select e.empno, e.ename, d.dname, s.grade
from salgrade s , emp e join dept d using(deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);

select * from emp;
select * from salgrade;
select * from dept;

-- quiz 3
-- ��� ���� ������ ���� ����� ename, sal, �Ŵ��� �̸�, �Ŵ��� �޿�

select e1.ename,e1.sal,e2.ename,e2.sal
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno)
where e1.sal > e2.sal;

-- Q1
select e.deptno,d.dname,e.empno,e.ename,e.sal
from emp e, dept d
where e.deptno = d.deptno
and e.sal > 2000
order by deptno;

-- Q2
select e.deptno, d.dname, trunc(avg(sal)), max(sal),min(sal),count(*)
from emp e, dept d
where e.deptno = d.deptno
group by e.deptno,d.dname;

-- Q3
select d.deptno,dname,e.empno,e.ename,job,sal
from dept d left outer join emp e on(e.deptno = d.deptno)
order by d.deptno,e.ename;


select * from emp
where sal > (select sal from emp where ename = 'JONES');

--��պ��� ���� ������ �޴»����
select * from emp
where sal > (select avg(sal) from emp);

--BLACK ������ ���� ������ �޴»����
select * from emp
where sal > (select sal from emp where ename = 'BLAKE');

--JONES ���� ���� ������ ���� �����
select * from emp
where job = (select job from emp where ename = 'JONES');

select * from emp
where sal in (
select max(sal) from emp group by deptno
);

select *
from (select * from emp where deptno = 10) e10;

select rownum, e.* from (select * from emp order by ename) e
--where rownum = 4
;

select job,count(*) from emp
group by job
having count(*) >= 3;

select * 
from   (select job,count(*) cnt from emp
        group by job)
where cnt >= 3;

with 
e10 as (select * from emp where deptno= 10),
e20 as (select * from emp where deptno= 20)
select * from e10;

-- Q1
select e.job,e.empno,e.ename,e.sal,d.deptno,d.dname from emp e, dept d
where e.deptno = d.deptno
and e.job = (select job from emp where ename = 'ALLEN')
order by sal desc, ename;
select * from salgrade s
;
-- Q2
select empno,ename,dname,hiredate,loc,sal,grade from emp e,salgrade s,dept d
where e.sal between losal and hisal
and e.sal > (select avg(sal) from emp)
and e.deptno = d.deptno
order by sal desc,empno;
--select job from emp where deptno = 10;

-- Q3
select job from emp where deptno = 30;
--(select * from emp where deptno = 30)
--(select * from emp where deptno = 10)
select e.empno,e.ename,e.job,d.deptno,dname,loc from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 10
and job not in (select job from emp where deptno = 30);

-- Q4
select empno,ename,sal,grade from emp,salgrade 
where sal between losal and hisal
and sal > (select max(sal) from (select * from emp where job = 'SALESMAN'))
order by empno;

-- 12��

select * from emp;
select * from salgrade;
desc emp;

create table emp_ddl (
    empno number(4),    -- ���� 4�ڸ�!
    ename varchar2(10), -- 10 ����Ʈ!
    job varchar2(9),    -- ���Ѻ��� ���� �۾��� ������ �۾� ��ŭ�� ������ ����
    mgr number(4),
    hiredate date,
    sal number(7,2),    -- 2��° �������ڴ� �Ҽ��� ()�ڸ����� ����� �� �ִ�
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

-- ���̺��� �״�� �����ϴ� ���---------
create table dept_ddl
    as select * from dept;
-------------------------------------
select * from dept_ddl;

create table emp_ddl_30
as select empno,ename,sal,deptno from emp where deptno = 30;

select * from emp_ddl_30;

select * from emp
where 1 <> 1 ;

create table emp_alter
    as select * from emp;
    
select * from emp_alter;

alter table emp_alter
 add hp varchar2(20);
 
select * from emp_alter;

alter table emp_alter
    rename column hp to tel;

select * from emp_alter;

alter table emp_alter
    modify empno number(5);
-- ũŰ�� Ŀ���°� ����(�پ��°� �Ұ���)
alter table emp_alter
    modify empno number(4);
    
alter table emp_alter
    drop column tel;

select * from emp_alter;

rename emp_alter to emp_rename;

select * from emp_rename;

truncate table emp_rename;

drop table emp_rename;


create table dept_temp
as select * from dept;

select * from dept_temp;

insert into dept_temp(deptno,dname,loc)
values (50,'DATABASE','SEOUL');

insert into dept_temp -- ���̺�� �ڿ� ()�� �����ϸ� ��� �÷�
values (60,'network','Busan');

insert into dept_temp       
values (70,'��',null); -- null �ֱ� �̰Ÿ� ����~

insert into dept_temp    -- �̰͵� null������
values (80,'mobile',''); -- java���� ������ null�� �ν����� ���Ѵ�.

select * from dept_temp;

insert into dept_temp(deptno,loc)
values (90,'��õ');

create table emp_temp
as select * from emp;
 select * from emp_temp;
insert into emp_temp
values (9999,'ȫ�浿','PRESIDENT',null,'2001/01/01',5000,1000,10);

insert into emp_temp
values (1111,'������','MANAGER',9999,'2001/01/05',4000,null,20);

insert into emp_temp
values (2111,'�̼���','MANAGER',9999,to_date('07/01/2001','DD-MM-YYYY'),4000,null,20);

insert into emp_temp
values (3111,'��û��','MANAGER',9999,sysdate,4000,null,30);
insert into emp_temp
select * from emp where deptno = 10; -- insert �� ���� �δ��� ����

select * from dept_temp2;

create table dept_temp2
as select * from dept;

update dept_temp2
set loc = 'SEOUL';
rollback;


-- update �ϱ����� select�� where ������ ��Ȯ���� Ȯ���ϰ�
-- where�� �״�� �����ؼ� update�� �ٿ��ֵ��� ���� �� ��!!
update dept_temp2
set dname = 'DATABASE',
    loc = 'SEOUL'
where deptno = 40;

select * from dept_temp2;

select * from dept_temp2
where deptno = 40;

create table emp_temp2
as select * from emp;

select * from emp_temp2;

select * from emp_temp2
where job = 'MANAGER';

delete emp_temp2
where job = 'MANAGER';

-- emp_temp2 ���� �޿��� 1000������ 
-- ����� �޿��� 3% �λ��Ͻÿ�

select *from emp_temp2
where sal <= 1000;

update emp_temp2
set sal = (sal*1.03)
where sal <= 1000;

delete emp_temp2;
select *from emp_temp2;
rollback;

select * from dict;

select * from user_tables;

select * from user_constraints;

-- index ����
-- ��������, �������� ���� ����
create index idx_emp_sal
ON EMP(SAL);

select * from user_indexes;

drop index idx_emp_sal;
/*+ index(idx_emp_sal) */
-- ���� hint
select /*+ index(idx_emp_sal) */
* from emp e
order by empno desc;
-- plan
-- sql developer���� ��� ����° ������ "��ȹ����"


select max(empno),max(empno+1) from emp;

insert into emp_temp2 (empno,ename)
    values (
            (select max(empno)+1 from emp_temp2),
            '������3'
    );
select * from emp_temp2;
rollback;

create table tb_user (
    user_id number,
    user_name varchar2(30)
);

select * from tb_user;

create sequence seq_user;

select seq_user.nextval from dual;
select seq_user.currval from dual;

insert into tb_user (user_id, user_name)
values (seq_user.nextval,'������1');

insert into tb_user (user_id, user_name)
values (seq_user.nextval,'������2');

insert into tb_user (user_id, user_name)
values (seq_user.nextval,'������3');

select * from tb_user;
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
    union -- ���� �ٸ� ���̺� �ִ� ��ȸ ������� �ѹ��� �� �� �ְ� ���ش�
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
    substr(ename,-(length(ename))+1,length(ename)),
    lpad(substr(ename,-(length(ename))+1,length(ename)),length(ename),'*')
from emp;
-- �ǽ� 4
-- �ι�° �۾��� *
    select
        ename,
        lpad(ename,1),
        rpad(lpad(ename,1),2,'*') ||
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


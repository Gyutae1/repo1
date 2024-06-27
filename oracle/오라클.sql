-- 한줄 주석
/* 범위 주석 */
SELECT
    *   -- 모든 컬럼(행)
FROM
    emp; -- ;과 ;사이를 실행시켜준다
-- sql developer 자동 정렬 단축키 : ctrl + F7
SELECT
    empno,  -- 조회하고 싶은 컬럼 명들
    ename,
    deptno
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 복사 단축키 : ctrl + shift + d

-- distinct : select에서 중복되는 자료를 제거해준다.
select distinct deptno from emp;
select distinct job from emp;

select deptno,job from emp;
-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는걸 제거한다.
select distinct deptno,job from emp;

--  null과 연산하면 무조건 null이다.
select ename, sal, sal*12+comm, comm from emp;
-- 컬럼명에 별칭 사용
-- " 생략가능
-- as 생략가능
-- 별칭안에 띄어쓰기가 있는경우 " 생략 불가
-- 가능하면 띄어쓰기보다 _를 넣자
select ename, sal, sal*12+comm as new_SAL, comm from emp;

-- order by : 해당 컬럼으로 정렬
-- 오름차순 : asc 생략가능
-- 내림차순 : desc
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by : 첫번째거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
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
--where sal != 3000; 밑에 <> 과 동일
where sal <> 3000;


select * from emp
where not(sal >= 2000 and sal < 3000);

select * from emp
where job not in ('MANAGER','SALESMAN','CLERK');

select * from emp
where sal >= 2000 and sal <=3000;

select * from emp
where sal not between 2000 and 3000;

-- %는 어떤거든 관계없음
select * from emp
where ename like 'S%';

select * from emp
where ename like 'A%';

-- _는 딱 한글자인데 어떤 글자던 관계 없음

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
            -- union : 중복된 자료를 제거해줌
    union   -- 서로 다른 테이블에 있는 조회 결과물을 한번에 볼 수 있게 해준다
            -- 단, 조회한 컬럼의 개수,타입(int,string ...)이 같아야 한다.
select empno, ename, sal, deptno from emp
where deptno =10;

select empno, ename, sal, deptno from emp
where deptno =10
            
    union all   -- union all : 중복에 관계없이 합쳐준다.
            
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

-- upper, lower는 대소문자 구분 없이 like할때 딱 좋다
select * from emp
where lower(ename) like lower('%Mi%');

select ename, length(ename) from emp
where length(ename) >= 5;

select length('한'), lengthb('한') from dual;

-- substr : 대상이되는 문자, 시작위치, 가져올 개수
-- 가져올 개수를 안쓰거나 너무 크면 끝까지 출력
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


-- lpad : 대상이 되는 문자, 전체 자리수, 채울 문자
-- 채울 문자 생략 시 공백문자로 우로 정렬한 효과
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
-- || : 문자열 더하기
select empno || ename || '님'
from emp;

-- trim : 앞 뒤 공백 제거
-- 글씨 사이의 공백은 제거하지 않음
select
    '   a b c      ',
    trim('   a b c      ')
from dual;

-- 실습문제 1
select
    '210612-3123456',
    '210612-3******',
    lpad('210612-3123456',8),
    rpad(lpad('210612-3123456',8),14,'*')
from dual;

-- 실습문제 2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시

select
    ename,
    lpad(ename,2),
    rpad(lpad(ename,2),length(ename),'*')
from emp;

-- 실습 3
-- 앞글자 하나만
-- length(ename)
select
    ename,
    substr(ename,2),
    lpad(substr(ename,2),length(ename),'*')
from emp;
-- 실습 4
-- 두번째 글씨만 *
    select
        ename,
        lpad(ename,1),
        rpad(lpad(ename,1),2,'*')
        ||
        substr(ename,3,length(ename))
    from emp;
-- 실습 5
-- 가운데 글씨만 * length(lpad(ename,length(ename)/2+1))-1
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
    sysdate,   -- sysdate : 지금 오라클 pc의 시간이 나옵니다
    sysdate+1, -- 강사님의 pc는 9시간 차이 난다 (영국 0시 기준 한국 +9시)
    sysdate-1  -- 날짜 정보 중 일부만 select로 표시 됨
from dual;

-- 컬럼에 +를 적으면 모두 숫자로 변경
-- || 숫자도 문자로 적용

select to_char(sysdate+9/24, 'YYYY"년"MM"월"DD"일" HH24"시" MI"분" SS"초"') from dual;

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

-- count처럼 null은 제외됨
-- count *을 많이 씀
select sum(sal), count(sal),count(*),count(comm) from emp;

select count(*) from emp where ename like '%A%'; -- 특정 단어가 들어가있는 셀의 개수

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- 부서별로 sal을 sum 하자 deptno union all 을 합치자 

select sum(sal), avg(sal) from emp
where deptno =10
union all
select sum(sal), avg(sal) from emp
where deptno =20
union all
select sum(sal), avg(sal) from emp
where deptno =30;

-- distinct 처럼 중복을 제거해줌, 또는 분류해줌
-- select에는 group by한 것이나 다중행 함수(집계 함수)
select deptno, avg(sal),sum(sal),count(*) from emp
group by deptno;

select deptno,empno,sum(sal),count(*) from emp
group by deptno,empno;

select deptno,job,count(*)from emp
group by deptno,job

order by deptno, job;

-- having : group by 에서만 사용된다
-- 집계 함수를 조건으로 걸고 싶은 경우에 사용

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
-- 테이블 두개 이상 조회할때 관계를 꼭 알려줘야 원하는 정보만 출력된다
-- 전체 테이블 수 - 1 개의 조건이 적당하다

select * 
from emp e, dept d
where e.deptno = d.deptno;

select ename, d.* -- *와 컬럼을 같이 쓰는 경우 *에 테이블을 지정해줘야 한다. 
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

-- left outer join : 왼쪽 테이블을 모두 출력하는걸 보장해준다
select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);

-- quiz 1
-- empno, ename, dname, loc 출력 :결과 14줄

-- quiz 2
-- 사번,이름,부서명,급여등급을 출력 : 결과 14줄

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
-- 상사 보다 월급이 높은 사원의 ename, sal, 매니저 이름, 매니저 급여

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

--평균보다 많은 연봉을 받는사람들
select * from emp
where sal > (select avg(sal) from emp);

--BLACK 씨보다 많은 연봉을 받는사람들
select * from emp
where sal > (select sal from emp where ename = 'BLAKE');

--JONES 씨와 같은 직업을 가진 사람들
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

-- 12장

select * from emp;
select * from salgrade;
desc emp;

create table emp_ddl (
    empno number(4),    -- 숫자 4자리!
    ename varchar2(10), -- 10 바이트!
    job varchar2(9),    -- 제한보다 적은 글씨가 적히면 글씨 만큼의 공간만 차지
    mgr number(4),
    hiredate date,
    sal number(7,2),    -- 2번째 전달인자는 소수점 ()자리까지 기록할 수 있다
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

-- 테이블을 그대로 복사하는 방법---------
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
-- 크키가 커지는건 가능(줄어드는건 불가능)
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

insert into dept_temp -- 테이블명 뒤에 ()을 생략하면 모든 컬럼
values (60,'network','Busan');

insert into dept_temp       
values (70,'웹',null); -- null 넣기 이거만 쓰자~

insert into dept_temp    -- 이것도 null이지만
values (80,'mobile',''); -- java에서 읽을때 null로 인식하지 못한다.

select * from dept_temp;

insert into dept_temp(deptno,loc)
values (90,'인천');

create table emp_temp
as select * from emp;
 select * from emp_temp;
insert into emp_temp
values (9999,'홍길동','PRESIDENT',null,'2001/01/01',5000,1000,10);

insert into emp_temp
values (1111,'성춘향','MANAGER',9999,'2001/01/05',4000,null,20);

insert into emp_temp
values (2111,'이순신','MANAGER',9999,to_date('07/01/2001','DD-MM-YYYY'),4000,null,20);

insert into emp_temp
values (3111,'심청이','MANAGER',9999,sysdate,4000,null,30);
insert into emp_temp
select * from emp where deptno = 10; -- insert 가 위험 부담이 적다

select * from dept_temp2;

create table dept_temp2
as select * from dept;

update dept_temp2
set loc = 'SEOUL';
rollback;


-- update 하기전에 select로 where 조건이 정확한지 확인하고
-- where를 그대로 복사해서 update에 붙여넣도록 하자 꼭 꼮!!
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

-- emp_temp2 에서 급여가 1000이하인 
-- 사원의 급여를 3% 인상하시오

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

-- index 색인
-- 오름차순, 내림차순 따로 관리
create index idx_emp_sal
ON EMP(SAL);

select * from user_indexes;

drop index idx_emp_sal;
/*+ index(idx_emp_sal) */
-- 강제 hint
select /*+ index(idx_emp_sal) */
* from emp e
order by empno desc;
-- plan
-- sql developer에서 상단 세번째 아이콘 "계획설명"


select max(empno),max(empno+1) from emp;

insert into emp_temp2 (empno,ename)
    values (
            (select max(empno)+1 from emp_temp2),
            '신입이3'
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
values (seq_user.nextval,'유저명1');

insert into tb_user (user_id, user_name)
values (seq_user.nextval,'유저명2');

insert into tb_user (user_id, user_name)
values (seq_user.nextval,'유저명3');

select * from tb_user;
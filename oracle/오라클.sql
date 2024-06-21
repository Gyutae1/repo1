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
    union -- 서로 다른 테이블에 있는 조회 결과물을 한번에 볼 수 있게 해준다
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
    substr(ename,-(length(ename))+1,length(ename)),
    lpad(substr(ename,-(length(ename))+1,length(ename)),length(ename),'*')
from emp;
-- 실습 4
-- 두번째 글씨만 *
    select
        ename,
        lpad(ename,1),
        rpad(lpad(ename,1),2,'*') ||
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


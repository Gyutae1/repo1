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

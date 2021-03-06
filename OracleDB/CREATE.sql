CREATE TABLE EMP_DDL(
EMPNO NUMBER(4),
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
);

DESC EMP_DDL;

CREATE TABLE DEPT_DDL
AS SELECT * FROM DEPT;

DESC DEPT_DDL;

SELECT * FROM DEPT_DDL;

CREATE TABLE EMP_DDL_30
AS SELECT *
FROM EMP
WHERE DEPTNO = 30;
SELECT * FROM EMP_DDL_30;

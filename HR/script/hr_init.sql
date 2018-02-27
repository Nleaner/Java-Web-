drop table hr_tbldept;
create table hr_tbldept(
deptid number(7) primary key,
dname  VARCHAR2(50)
);
drop sequence hr_tbldept_deptid;
create sequence hr_tbldept_deptid;

drop table hr_tblemp;
create table hr_tblemp(
empid number(7) primary key,
ename VARCHAR2(50) not null,
egendar number(1) not NULL,
depid number(7) not null,
empdate date not NULL
);
drop sequence hr_tblemp_empid;
create sequence hr_tblemp_empid;

INSERT into hr_tbldept values(1,'人力资源');
INSERT into hr_tbldept values(2,'市场');




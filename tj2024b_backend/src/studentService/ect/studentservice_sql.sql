drop database if exists studentservice;                
create database studentservice;           
use studentservice;   

create table student(
	sname varchar(20),
    sko int,
    smt int,
    sen int
);
insert into student(sname,sko,smt,sen) values('ㅇㅇㅇ',12,12,12);
select * from student;

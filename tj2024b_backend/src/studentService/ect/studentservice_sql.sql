drop database if exists studentservice;                
create database studentservice;           
use studentservice;   

create table student(
	sname varchar(20),
    sko int,
    smt int,
    sen int
);

select * from student;

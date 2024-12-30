create database my1230;
use my1230;

create table testtable1(필드명 int);
show tables;

create table testtable2(필드명1 int, 필드명2 double);

drop table testtable2;
drop table if exists testtable1;

#데이터타입
/*
	[정수]
		tinyint		1바이트 		-128 ~ +127
        smallint	2바이트		+-3만정도 
        mediumint	3바이트		+-800만정도 
        int			4바이트		+-21억이상 
        bigint		8바이트		+-21억이상 
        
	[실수]
		float		4바이트		부동소수점(표현 범위 이상일 경우 오차 발생)
        double		8바이트		부동소수점(표현 범위 이상일 경우 오차 발생)
        decimal		문자타입		실수를 문자로 처리하는 타입, 오차 없음 
	[날짜]
		date		날짜표현 0000-00-00,	1000년 ~ 9999년
        time		시간표현 00:00:00
        datetime	날짜/시간표현 0000-00-00 00:00:00
	[문자열]
		char		(문자길이) 문자, 고정길이, 최대 255글자 
        varchar		(문자길이) 문자, 가변길이, 최대 255글자
        text		문자열 표현, 최대 6만 글자
        longtext	문자열 표현, 최대 42억 글자,	4GB, 대용량 
        
	[논리]
		bool		true or false,	tinyint
*/
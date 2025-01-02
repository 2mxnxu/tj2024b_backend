# 데이터베이스 생성
drop database if exists mydb0102;
create database mydb0102;
use mydb0102;
# 2. 테이블 생성
create table table1(
	mno int auto_increment,
    mname varchar(30) not null unique,
    mcount int,
    constraint primary key(mno)
);

# DML : 데이터베이스 조작어 
# 1. insert 2. select 3. update 4. delete
#	  [C]		[R]		   [U]		[D]

# [1] insert : 레코드 (행/)
#insert into table1(속성명1, 속성명2) values (값1,값2);
insert into table1(mname, mcount) values ('박명수',10);
insert into table1(mcount, mname) values (20,'유재석'); # mname 속성에 제약조건이 unique 했음으로 중복 삽입 불가
#insert into table1(mcount) values (20);				   # mname속성에 제약조건이 not null 이므로 삽입 시 초기값 대입 해야한다.
insert into table1(mno,mname, mcount) values (3,'강호동',30);
insert into table1 values (4,'신동엽',40); # 테이블에 모든 속성들을 순서대로 초기값 대입할 경우 속성명은 생략 가능
# insert 에 여러개 레코드 삽입 
insert into table1 values (5,'서장훈',50),(6,'하하',60) ;

# [2] select : 레코드(행/튜플) 조회
#select * from 테이블명;
select * from table1;
# 특정속성 레코드 조회
select mno from table1;
select mno, mname, mcount from table1;
# 3. 레코드 조회 할때 속성값 조건, [조건절] where 조건;
select * from table1 where mname = '유재석';
select * from table1 where mno = 3;

# [3] update : 레코드의 속성 값 수정
# 1. 전체 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값 
update table1 set mcount = 0; # 오류 : mysql workbench safe mode 끄기 다시 실행.
set SQL_SAFE_UPDATE = 0; # safe mode 끄기 
set SQL_SAFE_UPDATE = 1; # safe mode 사용, 

# 2. 특정 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값 where [조건절]
update table1 set mcount = 100 where mname = '유재석'; # mname 속성값이 '유재석' 인 레코드의 mcount 속성값을 100으로 수정
# 3. 여러 속성값 수정 : update 테이블명 set 속성명1 = 새로운값, 속성명2 = 새로운값 where [조건절]
update table1 set mname = '강호동', mcount = 200 where mno = 3; # mno 속성값이 3인 레코드의 mname과 mcount 값 수정

# [4] delete : 레코드 삭제 
# 1. 전체 레코드 삭제 : delete from 테이블명;
# delete from table1;

# 2. 특정 레코드 삭제 : delete from 테이블명 where [조건절]
delete from table1 where mno = 3;
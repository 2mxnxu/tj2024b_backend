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
		bool		true or false,	tinyint 와 같다
*/

create table testtable3(정수필드1 tinyint, 정수필드2 smallint, 정수필드3 mediumint, 정수필드4 int, 정수필드5 bigint,
실수필드1 float, 실수필드2 double,
날짜필드1 date, 시간필드 time, 날짜시간 datetime,
문자필드1 char(100), 문자필드2 varchar(100), 문자필드3 text, 문자필드4 longtext, 
논리필드 bool
);
show tables;
select * from testtable3;

create database boardservice9;

use boardservice9;

create table board(
	title varchar(100),
    content longtext,
    writer varchar(30)
    );
show tables;

create database waitingservice;
use waitingservice;
create table waiting(
	phone char(13),
    count int
);
show tables;

/*
	1. not null : 해당 필드에 null 값을 포함하지 않는다.
    2. unique : 해당 필드에 중복값을 포함하지 않는다.
    3. default 기본값 : 레코드(값) 삽입시 해당 필드에 값을 대입하지 않으면 기본값으로 초기화 한다.
		default now() : 레코드 삽입시 현재 시스템의 날짜/시간 초기화 
	4. auto_increment : (MYSQL만 가능) 레코드 삽입시 순서대로 자동 번호가 삽입 된다.
    5. primary key : 기본/식별키 - pk, 식별가능한 고유 값 필드 키
    - pk 필드는 not null 과 unique 포함된다.
    6. foregin key : 참조/외래키 , 다른테이블의 기본키를 참조하는 키
    * 관계형 데이터베이스의 관례적으로 기본키pk는 테이블당 1개 이상 갖는다.
*/

# 제약조건 : 테이블에서 문제/결함 되는 데이터가 입력되지 않도록 제약
use mydb1230;
create table testtable4(
	# 필드명 타입 제약조건
    필드명1 tinyint not null, -- 지정한 필드에는 null을 대입할 수 없다.
    필드명2 smallint unique, -- 지정한 필드에는 중복값을 대입할 수 없다.
    필드명3 int default 10 , -- 지정한 필드에는 레코드 삽입시 값을 생략하면 자동으로 기본값이 대입된다.
    필드명4 bigint auto_increment, -- 지정한 필드에는 레코드 삽입시 순서대로 자동번호가 대입된다.
    PK필드명5 double, 
    constraint primary key(PK필드명5) -- 지정한 필드를 pk필드로 설정(not null 과 unique 포함)
); 
create table testtable5(
	FK필드명1 double,
	constraint foreign key(FK필드명1) references testtable4(PK필드명5) -- 지정한 필드를 fk필드로 설정하고 참조할 pk필드가 위치한 테이블명과 pk필드명을 작성한다.
);

create database boardservice7;
use boardservice7;
#회원테이블 
create table member(
	mno int auto_increment, -- 회원번호 자동번호로 부여하기 위해
    mid varchar(30) not null unique, -- 회원아이디는 공백이라는 아이디가 존재하면 안되서 not null 제약조건 선택
    mpwd varchar(30) not null,
    mname varchar(10) not null,
    constraint primary key(mno)
);
#게시판 테이블
create table board(
	bno bigint auto_increment, 
    btitle varchar(100) not null,
    bcontent text, 
    bdate datetime default now(),
    bview int default 0,
    #pk 필드
    constraint primary key(bno),
    #fk 필드
    mno int,
    constraint foreign key(mno) references member(mno) # board테이블의 mno 필드가  member테이블의 mno 필드를 참조한다. 
);



create database kiosk;
use kiosk;
create table kioskmenu(
	kno int auto_increment, #카테고리 식별코드
    kname varchar(10) not null, #카테고리 이름 
    constraint primary key(kno)
);

create table kioskproduct(
	pno int not null unique, #제품번호
    pname varchar(10) not null, #제품이름
    pprice int unsigned default 0, #제품가격
    kno int,
    constraint primary key(pno),
    kno int,
    constraint foreign key(kno) references kioskmenu (kno)
);

create table kioskorder(
	ono bigint auto_increment, #주문번호
    odate datetime default now(), #주문날짜
    constraint primary key(ono)
);

create table orderdetail(
	odno int auto_increment,	#주문상세
    odamount tinyint unsigned not null,		#주문수량
    constraint primary key(odno),
    pno int,
    constraint foreign key(pno) references kioskproduct (pno),
    ono int,
    constraint foreign key(ono) references kioskproduct (ono)
);

show tables;
select * from kioskmenu;
select * from kioskproduct;
select * from kioskorder;
select * from orderdetail;


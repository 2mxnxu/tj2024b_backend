create database kiosk;
use kiosk;
create table kioskmenu(
	kno int not null, #카테고리 식별코드
    kname varchar(10) not null, #카테고리 이름 
    constraint primary key(kno)
);

create table kioskproduct(
	pno int not null unique, #제품번호
    pname varchar(10) not null, #제품이름
    pcount smallint not null, #제품수량
    pprice int not null, #제품가격
    kno int,
    constraint foreign key (pno) references kioskmenu (kno)
);

create table kioskorder(
	ono bigint auto_increment, #주문번호
    odate datetime default now(), #주문날짜
    constraint primary key(ono)
);
show tables;
select * from kioskmenu;
select * from kioskproduct;
select * from kioskorder;


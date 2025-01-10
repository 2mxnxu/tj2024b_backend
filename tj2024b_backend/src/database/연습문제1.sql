# 실습1 : 모든 제품(product) 테이블 레코드 조회시 카테고리 번호 대신에 카테고리명을 조회하는 SQL 작성
#		 제품번호 1번의 재고수량 합계를 조회하는 SQL, 그리고 조회시 제품명 속성과 합계수량 속성명으로 표시 

create table pcategory(
        카테고리번호_pk int unsigned auto_increment , 
    # 속성(필드) 임의 , int(식별키숫자) , unsigned(부호없다.) , auto_increment(레코드삽입시 자동번호부여)
    카테고리명 varchar(10) not null , #속성(필드) 임의 , varchar(10) : 카테고리명이 최대 10글자로 이내로 작성하기 위해서
    primary key( 카테고리번호_pk) # pk필드 선언하기 , primary key( pk필드명 ) 
);
# 제품 테이블 
create table product( 
        제품번호_pk int unsigned auto_increment , 
    제품명 varchar(100) not null, # 제품명을 최대 100 글자 이내로 작성하기 위해서 
    제품가격 int unsigned not null , # 40억 이하로 가격을 작성하고 -(음수) 없음 , not null : 공백이 아닌 필드 설정 ( 공백삽입시 오류발생 )
    카테고리번호_fk int unsigned , # 카테고리 테이블의 pk필드 를 참조할 fk필드 
    primary key( 제품번호_pk ) , # pk 필드 선언하기 # pk필드는 자동으로 not null(null방지) 과 unique(중복방지) 제약조건이 설정된다.
    foreign key( 카테고리번호_fk ) references pcategory( 카테고리번호_pk ) # fk 필드 설정하기 
    # foreign key( fk필드명 ) references pk테이블명( pk필드명 )
);
# 재고 테이블 
create table stock( 
        재고번호_pk int unsigned auto_increment , 
    재고수량 int ,
    재고등록날짜 datetime default now() ,  # date(날짜타입) , default : 레코드삽입시 초기값를 선언하기 , now() : 현재 시스템 날짜/시간 반환 함수 
        제품번호_fk int unsigned ,                 # 제품 테이블의 pk필드를 참조할 fk필드 
    primary key( 재고번호_pk ) ,                 # 모든 테이블은 pk필드를 1개 이상 갖는다.(권장) 
    foreign key( 제품번호_fk ) references product( 제품번호_pk ) # fk 필드 설정하기 
);
SELECT p.제품번호_pk, p.제품명, p.제품가격, c.카테고리명
FROM product p
JOIN pcategory c ON p.카테고리번호_fk = c.카테고리번호_pk;

SELECT p.제품명, SUM(s.재고수량) AS 합계수량
FROM stock s
JOIN product p ON s.제품번호_fk = p.제품번호_pk
WHERE p.제품번호_pk = 1
GROUP BY p.제품번호_pk;


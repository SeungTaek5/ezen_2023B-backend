create database 은행;

use 은행;

create table 신한은행
(	no int not null,
	계좌번호 varchar(20) not null,
	계좌주 varchar(20) not null,
    입금액 bigint,
    마일리지 int
);

create table 국민은행
(	no int not null,
	계좌번호 varchar(20) not null,
	계좌주 varchar(20) not null,
    입금액 bigint,
    쿠폰 varchar(20)
);
create table 농협은행
(	no int not null,
	계좌번호 varchar(20) not null,
	계좌주 varchar(20) not null,
    입금액 bigint,
    포인트 int
);

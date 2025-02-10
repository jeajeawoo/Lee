DROP DATABASE IF EXISTS mysqlDB;
CREATE DATABASE mysqlDB CHARACTER SET utf8 COLLATE utf8_general_ci;

use mysqlDB;

create table 학생
(학번 varchar(8) NOT NULL primary key,
이름 varchar(10) NOT NULL,
주소 char(2),
연락처 char(10),
학과코드 int NOT NULL,
생년월일 date,
foreign key(학과코드) references 학과(학과코드)
);

create table 과목 
(과목코드 char(3) NOT NULL primary key,
과목명 varchar(20) not null,
과목개요 varchar(20) not null,
교수코드 varchar(10) not null,
foreign key(교수코드) references 교수(교수코드)
);

create table 수강신청
(수강코드 int auto_increment not null primary key,
학번 varchar(8) not null,
과목코드 char(3) not null,
학기 varchar(10) not null,
수강신청일 date,
foreign key(학번) references 학생(학번),
foreign key(과목코드) references 과목(과목코드)
);

create table 교수
(교수코드 varchar(10) not null primary key,
교수명 varchar(10) not null,
연락처 char(10),
학과코드 int not null,
foreign key(학과코드) references 학과(학과코드)
);

create table 학과
(학과코드 int auto_increment not null primary key,
학과명 varchar(20) not null,
학과장 varchar(10) not null,
연락처 char(10),
foreign key(학과장) references 교수(교수코드)
);

insert into 학생 values('1234','홍길동','서울','1012341234','1','1999-07-21');
insert into 학생 values('5678','이순신','서울','1012341234','1','1999-07-21');
insert into 학생 values('1111','박지성','서울','1012341234','1','1999-07-21');
insert into 학생 values('2222','김연아','서울','1012341234','1','1999-07-21');
insert into 학생 values('5555','배수진','서울','1012341234','4','1999-07-21');
insert into 학생 values('3333','박찬호','서울','1012341234','2','1999-07-21');
insert into 학생 values('4444','이민기','서울','1012341234','3','1999-07-21');
insert into 과목 values('AAA','자바','프로그래밍언어','Prof-1');
insert into 과목 values('BBB','오라클','DB설계','Prof-2');
insert into 과목 values('CCC','php','프로그래밍언어','Prof-3');
insert into 과목 values('DDD','html','화면구현','Prof-4');
insert into 과목 values('EEE','C/C++','프로그래밍언어','Prof-1');
insert into 수강신청 values(null,'1243','AAA','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'1243','BBB','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'1243','CCC','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'1111','AAA','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'1111','DDD','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'2222','CCC','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'2222','EEE','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'5678','BBB','2023년 2학기','2023-08-22');
insert into 수강신청 values(null,'5678','CCC','2023년 2학기','2023-08-22');
insert into 교수 values('Prof-1','홍길동','1011112222','1');
insert into 교수 values('Prof-2','이승기','1011112222','1');
insert into 교수 values('Prof-3','이수근','1011112222','1');
insert into 교수 values('Prof-4','강호동','1011112222','1');
insert into 교수 values('Prof-5','강원기','1011112222','1');
insert into 교수 values('Prof-11','손흥민','1011112222','2');
insert into 교수 values('Prof-21','이순신','1011112222','3');
insert into 교수 values('Prof-31','이만기','1011112222','4');
insert into 교수 values('Prof-41','강감찬','1011112222','5');
insert into 학과 values(null,'컴퓨터공학과','Prof-1','1011112222');
insert into 학과 values(null,'전기공학과','Prof-11','1011112222');
insert into 학과 values(null,'전자공학과','Prof-21','1011112222');
insert into 학과 values(null,'물리학과','Prof-31','1011112222');
insert into 학과 values(null,'천체공학과','Prof-41','1011112222');

SELECT * FROM 학생;
SELECT * FROM 과목;
SELECT * FROM 수강;
SELECT * FROM 교수;
SELECT * FROM 학과;








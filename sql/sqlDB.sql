DROP DATABASE IF EXISTS sqlDB;
CREATE DATABASE sqlDB CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sqlDB;

CREATE TABLE userTbl 
( userID  	CHAR(8) NOT NULL PRIMARY KEY,
  name    	VARCHAR(10) NOT NULL,
  birthYear INT NOT NULL,
  addr	  	CHAR(2) NOT NULL,
  mobile1 CHAR(3),
  mobile2 CHAR(8),
  height    	SMALLINT,
  mDate    	DATE
);


CREATE TABLE buyTbl 
(  num   INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
   userID  CHAR(8) NOT NULL,
   prodName 	CHAR(6) NOT NULL,
   oDate 	DATE,
   price     	INT  NOT NULL,
   amount    	SMALLINT  NOT NULL,
   FOREIGN KEY (userID)  REFERENCES userTbl(userID)
);

INSERT INTO userTbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO userTbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO userTbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO userTbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO userTbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
INSERT INTO userTbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO userTbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
INSERT INTO userTbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO userTbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO userTbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
INSERT INTO buyTbl VALUES(NULL, 'KBS', '운동화', '2021-05-20', 30,   2);
INSERT INTO buyTbl VALUES(NULL, 'KBS', '노트북', '2021-06-20', 1000, 1);
INSERT INTO buyTbl VALUES(NULL, 'JYP', '모니터', '2021-05-01', 200,  1);
INSERT INTO buyTbl VALUES(NULL, 'BBK', '모니터', '2021-05-30', 200,  5);
INSERT INTO buyTbl VALUES(NULL, 'KBS', '청바지', '2021-06-20', 50,   3);
INSERT INTO buyTbl VALUES(NULL, 'BBK', '메모리', '2021-06-01', 80,  10);
INSERT INTO buyTbl VALUES(NULL, 'SSK', '책'    , '2021-06-14', 15,   5);
INSERT INTO buyTbl VALUES(NULL, 'EJW', '책'    ,  '2021-06-16', 15,   2);
INSERT INTO buyTbl VALUES(NULL, 'EJW', '청바지', '2021-06-29', 50,   1);
INSERT INTO buyTbl VALUES(NULL, 'BBK', '운동화', '2021-05-28', 30,   2);
INSERT INTO buyTbl VALUES(NULL, 'EJW', '책'    , '2021-06-06', 15,   1);
INSERT INTO buyTbl VALUES(NULL, 'BBK', '운동화', '2021-06-05' , 30,   2);

create table groupTbl  (
prodGroup varchar(20) PRIMARY KEY,
groupName varchar(20),
groupPoint SMALLINT
);

insert into groupTbl values("AA", "주방", 30);
insert into groupTbl values("BB", "서적", 100);
insert into groupTbl values("CC", "의류", 50);
insert into groupTbl values("EE", "전자", 200);
insert into groupTbl values("FF", "식품", 70);
insert into groupTbl values("HH", "취미", 80);

create table prodTbl  (
prodName varchar(20) PRIMARY KEY,
prodGroup varchar(20),
prodCom varchar(20),
prodStock SMALLINT
);

insert into prodTbl values("노트북", "EE", "LG전자", 10);
insert into prodTbl values("운동화", "CC", "나이스", 20);
insert into prodTbl values("모니터", "EE", "삼송전자", 30);
insert into prodTbl values("청바지", "CC", "게스트", 10);
insert into prodTbl values("메모리", "EE", "LG전자", 15);
insert into prodTbl values("책", "BB", "NO", 20);
insert into prodTbl values("인형", "HH", "AAA", 50);
insert into prodTbl values("선풍기", "EE", "삼송전자", 50);



SELECT * FROM userTbl;
SELECT * FROM buyTbl;
SELECT * FROM prodTbl;
SELECT * FROM groupTbl;
SELECT * FROM test;

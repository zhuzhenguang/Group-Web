DROP TABLE ADMIN;
DROP TABLE CUSTOM;
DROP TABLE IMAGE;
DROP TABLE TYPE;
DROP TABLE COMMODITY;

create table COMMODITY
(
	id bigint not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	url varchar(100) not null,
	price double not null,
	original_price double,
	discount double,
	sold_out integer,
	place varchar(200),
	type_code varchar(2),
	insert_date char(8),
	flag varchar(100)
);

create table IMAGE
(
	id bigint not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	commodity_id bigint not null,
	sys_name varchar(50) not null,
	path varchar(100) not null
);

create table TYPE
(
	code varchar(2) not null PRIMARY KEY,
	name varchar(50) not null
);

create table CUSTOM
(
	id bigint not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	user_id integer not null,
	custom_name varchar(40) not null,
	custom_type varchar(1) not null,--0为按商品类型定制, 1为按照网站定制
	custom_content varchar(200) not null
);

create table ADMIN
(
	user_id integer not null PRIMARY KEY,
	passwd varchar(50) not null
);

ALTER TABLE IMAGE
ADD CONSTRAINT COMMODITY_FK Foreign Key (commodity_id)
REFERENCES COMMODITY (id);

ALTER TABLE COMMODITY
ADD CONSTRAINT TYPE_FK Foreign Key (type_code)
REFERENCES TYPE (code);
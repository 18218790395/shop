create table t_product(
	id int primary key auto_increment,
	name varchar(50),
	price double
);

create table t_user(
	id int primary key auto_increment,
	username varchar(10),
	password varchar(10),
	phone varchar(20),
	address varchar(100)
);

create table t_cart(
	id int primary key auto_increment,
	name varchar(50),
	num int,
	price double
);

create table t_order(
	id varchar(50),
	date varchar(50)
);

create table t_orderandcart(
	id varchar(50),
	name varchar(50),
	num int,
	price double
);


insert into t_product (name,price) values ('挪威的森林',20);
insert into t_product (name,price) values ('向着光的那方',30);
insert into t_product (name,price) values ('永远不要停下前进的脚步',40);
insert into t_product (name,price) values ('史记',50);
commit;

insert into t_user (username,password,phone,address) values ('admin',123,10086,'njpji');
commit;
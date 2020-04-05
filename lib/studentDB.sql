drop database if exists studentDB;

create database studentDB default CHARSET utf8;

use studentDB;

create table studentinfo(
	id int not null primary key auto_increment,
	name varchar(20) not null
)default charset utf8;

insert into studentinfo values(null,'贺龙');
insert into studentinfo values(null,'大嘴');


select * from studentinfo;
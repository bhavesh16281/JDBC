drop database if exists online_shopping_database;
create database online_shopping_database;
use online_shopping_database;


DROP TABLE IF EXISTS admin;
CREATE TABLE admin (
  adminId int(11) unsigned NOT NULL AUTO_INCREMENT,
  firstName varchar(20) DEFAULT NULL,
  lastName varchar(20) DEFAULT NULL,
  emailId varchar(30) DEFAULT NULL,
  mobileNo double DEFAULT NULL,
  userName varchar(50) DEFAULT NULL,
  password varchar(10) DEFAULT NULL,
  PRIMARY KEY (adminId)
);

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
  custId int(11) unsigned NOT NULL AUTO_INCREMENT,
  firstName varchar(20) DEFAULT NULL,
  lastName varchar(20) DEFAULT NULL,
  emailId varchar(30) DEFAULT NULL,
  mobileNo double DEFAULT NULL,
  userName varchar(50) DEFAULT NULL,
  password varchar(10) DEFAULT NULL,
  PRIMARY KEY (custId)
);

DROP TABLE IF EXISTS products;
CREATE TABLE products (
	productId int(4) unsigned NOT NULL UNIQUE,
	brand varchar(20) DEFAULT NULL,
	model varchar(20) DEFAULT NULL,
	processor  varchar(20) DEFAULT NULL,
	androidVersion varchar(20) DEFAULT NULL,
	ram int(2) DEFAULT NULL,
	rom int(4) DEFAULT NULL,
	price double DEFAULT NULL,
	PRIMARY KEY (productId)
);
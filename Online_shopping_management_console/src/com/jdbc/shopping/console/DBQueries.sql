drop database if exists online_shopping_database;
create database online_shopping_database;
use online_shopping_database;


DROP TABLE IF EXISTS admin;
CREATE TABLE admin (
  adminId int(11) unsigned NOT NULL AUTO_INCREMENT,
  firstName varchar(20) DEFAULT NULL,
  lastName varchar(20) DEFAULT NULL,
  emailId varchar(30) DEFAULT NULL,
  insertTime datetime DEFAULT NULL,
  mobileNo double DEFAULT NULL,
  userName varchar(50) DEFAULT NULL,
  password varchar(10) DEFAULT NULL,
  PRIMARY KEY (adminId)
);
INSERT INTO admin (adminId, firstName, lastName, emailId, insertTime, mobileNo) VALUES
	(1001, 'MUTHYALU', 'BHAVESH','bhavesh16281@gmail.com','2016-01-28 00:00:00', 8309828565,);
--	(1002, 'James', 'Sr.Analyst', '2016-01-28 00:00:00', 0),
--	(1003, 'Rocky', 'Sr.Analyst', '2016-01-28 00:00:00', 100000);
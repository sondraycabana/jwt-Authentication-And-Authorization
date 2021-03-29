--drop user  if exists 'user_auth'@'localhost';
create user 'user_auth'@'localhost' identified by  'password123';
grant all privileges on userdb.* to 'user_auth'@'localhost';
flush privileges;

drop database if  exists userdb;
create database userdb;
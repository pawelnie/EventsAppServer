Building a String Boot Rest API v3. 

Tutorial https://medium.com/@salisuwy/building-a-spring-boot-rest-api-part-iii-integrating-mysql-database-and-jpa-81391404046a

Check http://medium.com/@salisuwy

CREATE DATABASE restapi;
USE restapi;
CREATE TABLE event (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(500) NOT NULL,
  description VARCHAR(5000) NOT NULL
);


use restapi;

show tables;


INSERT INTO `event` 
(`id`,`title`,`description`) 
VALUES 
(NULL, "New iPhoneX features", "blah blah blah.....");


select * from Blog;


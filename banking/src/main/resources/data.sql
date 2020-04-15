
drop table if exists bankaccount;

create table bankaccount(id int  not null auto_increment,firstname varchar(50),lastname varchar(50),
phonenumber bigint,accountnumber bigint,balance decimal(10,3),primary key(id));


insert into bankaccount(id,firstname,lastname,phonenumber,accountnumber,balance) values(1,'jay','vardhan',9121530642,12345,50000);
insert into bankaccount (firstname,lastname,phonenumber,accountnumber,balance)values('sri','janaki',9144530642,123456,40000);
insert into bankaccount(firstname,lastname,phonenumber,accountnumber,balance) values('sri','nadh',9144530642,123457,45000);
insert into bankaccount(firstname,lastname,phonenumber,accountnumber,balance) values('sai','kishore',9144535642,1234568,40300);


drop table if exists transaction;

 create table transaction(id int not null auto_increment,fromno bigint,tono bigint,transferamount
 decimal(10,3),primary key(id));
 
 insert into transaction (id,fromno,tono,transferamount)values(1,9405123456,9405124010,25000);
  insert into transaction (fromno,tono,transferamount)values(9405123457,9405124011,28000);
   insert into transaction (fromno,tono,transferamount)values(9405123756,9405125010,28000);
insert into transaction( fromno, tono,transferamount) values(920456789,970111111,10000);  

drop table if exists user;
create table user(id int not null auto_increment,phonenumber bigint,fullname varchar(50),balanceamt decimal(10,3),primary key(id));


insert into user(id,phonenumber,fullname,balanceamt) values (1,9204256789,'jayvardhan',50000); 

 insert into user(phonenumber,fullname,balanceamt) values (9204277789,'saikishore',50000); 


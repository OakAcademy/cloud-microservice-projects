create table if not exists persistent_logins(
username varchar(100) not null,
series varchar(64) primary key,
token varchar(64) not null,
last_used timestamp not null

);
insert into roles (id,name) values(1,'ROLE_ADMIN'),
(2,'ROLE_USER');
insert into users (id,email,password,name) values
(1,'admin@gmail.com','$2a$10$CW/t2hk7dnHejZutyEHL/uKeaD.iudJk1N9Qg96p25hypeAsIRIQm','Admin'),
(2,'employee1@gmail.com','$2a$10$CW/t2hk7dnHejZutyEHL/uKeaD.iudJk1N9Qg96p25hypeAsIRIQm','Employee'),
(3,'employee2@gmail.com','$2a$10$CW/t2hk7dnHejZutyEHL/uKeaD.iudJk1N9Qg96p25hypeAsIRIQm','Employee');

insert into user_role(user_id,role_id) values(1,1),(2,3),(3,3);
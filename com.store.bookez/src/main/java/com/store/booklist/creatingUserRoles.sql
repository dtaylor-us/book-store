create table users (    username varchar(50) not null primary key,    password varchar(255) not null,    enabled boolean not null) engine = InnoDb;create table authorities (    username varchar(50) not null,    authority varchar(50) not null,    foreign key (username) references users (username),    unique index authorities_idx_1 (username, authority)) engine = InnoDb;
select * from role;
INSERT INTO users(username, password, enabled) VALUES('admin', 'admin', '1');
INSERT INTO authorities VALUES('admin', 'ROLE_ADMIN');
select * from authorities;
select * FROM CUSTOMER;
SELECT * FROM USERS;
select * from book_order;


insert into customer(user_name, name, newsletter) value('deretayl1', 'Derek Taylor', 0);
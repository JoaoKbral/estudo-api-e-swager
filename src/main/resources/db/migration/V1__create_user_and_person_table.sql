CREATE TABLE users(
    ID serial primary key,
    login varchar(70) not null,
    password varchar(60) not null,
    email varchar(70) not null,
    user_roles varchar(10)
);

CREATE TABLE persons(
    id serial primary key,
    name varchar(70) not null,
    cpf varchar(11) not null,
    birthday date,
    gender character(1)
);
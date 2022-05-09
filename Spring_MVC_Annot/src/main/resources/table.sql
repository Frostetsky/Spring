create database student_book;

create table students(
    id serial primary key,
    name varchar(50),
    surname varchar(50),
    salary int
);
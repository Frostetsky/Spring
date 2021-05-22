CREATE TABLE users (
    username varchar(15),
    password varchar(100),
    enabled smallint,
    PRIMARY KEY (username)
);

CREATE TABLE authorities (
    username varchar(15),
    authority varchar(25),
    FOREIGN KEY (username) references users(username)
);

INSERT INTO users (username, password, enabled)
VALUES
('nikita', '{noop}nikita', 1),
('elena', '{noop}elena', 1),
('ivan', '{noop}ivan', 1);

INSERT INTO authorities (username, authority)
VALUES
('nikita', 'ROLE_Employee'),
('elena', 'ROLE_HR'),
('ivan', 'ROLE_HR'),
('ivan', 'ROLE_Manager');
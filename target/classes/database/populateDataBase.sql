DELETE FROM users;
DELETE FROM user_roles;
DELETE FROM vote_board;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES  ('Admin', 'admin@gmail.com', 654321),
        ('User', 'user@mail.ru', 123456);

INSERT INTO user_roles (roles, user_id)
VALUES ('Admin', 100000),
        ('User', 100000),
        ('User', 100001);

INSERT INTO vote_board (restaurant, dish, dish_price, date_time, vote, user_id)
VALUES  ('Joes','fish', 15.50, '2022-07-10 10:00:00', 'true', 100000),
        ('Joes','potatoe', 3.50, '2022-07-10 10:00:00', 'true', 100000 ),
        ('Joes', 'limonade', 1.50, '2022-07-10 10:00:00', 'true', 100000);
        ('Calipso', 'burger', 35.80, '2022-07-10 12:00:00', 'false', 100000),
        ('Calipso', 'rice', 15.80, '2022-07-10 12:00:00', 'false', 100000),
        ('Calipso', 'coffee', 5.80, '2022-07-10 12:00:00', 'false', 100000),
        ('Joes','fish', 15.50, '2022-07-10 15:00:00', 'true', 100001),
        ('Joes','potatoe', 3.50, '2022-07-10 15:00:00', 'true', 100001 ),
        ('Joes', 'limonade', 1.50, '2022-07-10 15:00:00', 'true', 100001);
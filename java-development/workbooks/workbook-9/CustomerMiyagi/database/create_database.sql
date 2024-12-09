DROP DATABASE IF EXISTS customerMiyagi;
CREATE DATABASE IF NOT EXISTS customerMiyagi;
USE customerMiyagi;

CREATE TABLE customer (
    `customer_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `phone` VARCHAR(12),
    CONSTRAINT `pk_customer` PRIMARY KEY (`customer_id`)
);

INSERT INTO customer(`name`, `phone`) VALUES
    ('Debani', '5555555555'),
    ('Jane Smith', '9876543210'),
    ('Alice Johnson', '5551234567'),
    ('Bob Brown', '5559876543'),
    ('Charlie Davis', '4445556666'),
    ('Emily Evans', '3332221111'),
    ('Frank Harris', '9998887777'),
    ('Grace Lee', '8887776666'),
    ('Henry Adams', '7776665555'),
    ('Ivy Clark', '6665554444');

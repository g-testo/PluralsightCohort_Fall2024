DROP DATABASE IF EXISTS customerMiyagi;
CREATE DATABASE IF NOT EXISTS customerMiyagi;
USE customerMiyagi;

CREATE TABLE customer (
    `customer_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `phone` VARCHAR(12),
    PRIMARY KEY (`customer_id`)
);

CREATE TABLE category (
    `category_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`category_id`)
);

CREATE TABLE product (
    `product_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `price` FLOAT NOT NULL,
    `category_id` INTEGER,
    PRIMARY KEY (`product_id`),
    FOREIGN KEY (`category_id`) REFERENCES category(`category_id`)
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

-- Insert categories
INSERT INTO category(`name`) VALUES
    ('Garden'),
    ('Indoor Plants'),
    ('Outdoor Decor'),
    ('Planters'),
    ('Gardening Tools'),
    ('Artificial Plants');

-- Insert products with corresponding category IDs
INSERT INTO product(`name`, `price`, `category_id`) VALUES
    ('Orchid Planter', 49.99, 4),
    ('Bamboo Vase', 34.99, 4),
    ('Succulent Pot', 19.99, 4),
    ('Hanging Basket', 29.99, 4),
    ('Terracotta Pot', 14.99, 4),
    ('Ceramic Flower Vase', 39.99, 4),
    ('Modern Planter', 59.99, 4),
    ('Garden Tools Set', 24.99, 5),
    ('Indoor Watering Can', 12.99, 5),
    ('Outdoor Fountain', 199.99, 3),
    ('Bird Feeder', 22.99, 3),
    ('Wooden Plant Stand', 44.99, 3),
    ('Plant Propagation Station', 18.99, 2),
    ('Artificial Palm Tree', 89.99, 6),
    ('Cactus Grow Kit', 15.99, 2),
    ('Mini Bonsai Tree', 29.99, 2),
    ('Outdoor Garden Bench', 149.99, 3),
    ('Herb Growing Kit', 19.99, 2),
    ('Wall-mounted Planter', 49.99, 4),
    ('Gardening Gloves', 9.99, 5),
    ('Pruning Shears', 15.99, 5),
    ('Artificial Orchid', 39.99, 6),
    ('Patio Umbrella', 79.99, 3),
    ('Succulent Starter Kit', 24.99, 2),
    ('Glass Terrarium', 34.99, 2),
    ('Compost Bin', 59.99, 5),
    ('Hose Reel', 49.99, 5),
    ('Decorative Garden Gnome', 24.99, 3),
    ('Outdoor Lighting Set', 89.99, 3),
    ('Hanging Plant Terrarium', 27.99, 2);
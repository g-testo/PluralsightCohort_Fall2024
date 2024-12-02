-- Drop and create the database
DROP DATABASE IF EXISTS dealership_db;
CREATE DATABASE IF NOT EXISTS dealership_db;
USE dealership_db;

-- Create the dealership table
CREATE TABLE `dealership` (
    `dealership_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50),
    `phone` VARCHAR(12),
    CONSTRAINT `pk_dealership` PRIMARY KEY (`dealership_id`)
);

-- Create the vehicle table
CREATE TABLE `vehicle` (
    `vin` VARCHAR(17) NOT NULL,
    `make` VARCHAR(255) NOT NULL,
    `model` VARCHAR(255),
    `color` VARCHAR(255),
    `sold` BOOLEAN,
    `dealership_id` INTEGER,
    CONSTRAINT `pk_vin` PRIMARY KEY (`vin`),
    FOREIGN KEY (dealership_id) REFERENCES dealership(dealership_id)
);

-- Insert data into dealership table
INSERT INTO `dealership` (`name`, `address`, `phone`) VALUES
('City Motors', '123 Main St', '1234567890'),
('Auto Haven', '456 Elm St', '0987654321'),
('Drive Away', '789 Oak St', '1122334455');

-- Insert data into vehicle table with randomized VINs
INSERT INTO `vehicle` (`vin`, `make`, `model`, `color`, `sold`, `dealership_id`) VALUES
('1HG5M826X3A123456', 'Toyota', 'Camry', 'Blue', FALSE, 1),
('3FA6P0LU4KR123457', 'Honda', 'Civic', 'Red', TRUE, 1),
('1HGCM82633A283954', 'Ford', 'Focus', 'White', FALSE, 1),
('2C3CDXCT7MH523960', 'Chevrolet', 'Malibu', 'Black', TRUE, 1),
('3N1CN7AP7KL123458', 'Nissan', 'Altima', 'Silver', FALSE, 1),
('5UXWX9C5XF0D12349', 'BMW', '3 Series', 'Blue', FALSE, 2),
('WAUG8AF51JA059964', 'Audi', 'A4', 'Red', TRUE, 2),
('WDDGF8AB2EA923457', 'Mercedes', 'C-Class', 'Black', FALSE, 2),
('5NPE24AF3GH123459', 'Hyundai', 'Elantra', 'White', TRUE, 2),
('KNAFX5A86F5192483', 'Kia', 'Optima', 'Gray', FALSE, 2),
('5YJ3E1EB8KF123468', 'Tesla', 'Model 3', 'Red', TRUE, 3),
('JTDBL40E399X83745', 'Toyota', 'Corolla', 'Blue', FALSE, 3),
('1HGCV1F35JA230942', 'Honda', 'Accord', 'Black', TRUE, 3),
('JM1BPACL6K1371234', 'Mazda', '3', 'Silver', FALSE, 3),
('3VW267AJ6GM087413', 'Volkswagen', 'Jetta', 'White', FALSE, 3),
('JF1GPAA65DH203764', 'Subaru', 'Impreza', 'Gray', FALSE, 1),
('3GNAXUEV5LS582394', 'Chevrolet', 'Cruze', 'Blue', TRUE, 1),
('1FA6P8CF0J5149234', 'Ford', 'Fusion', 'Red', FALSE, 1),
('1N4AA6AP7KC123472', 'Nissan', 'Maxima', 'Black', TRUE, 1),
('5NPE24AF3GH572834', 'Hyundai', 'Sonata', 'Silver', FALSE, 1),
('5UXWX7C59G0D53485', 'BMW', 'X5', 'Gray', FALSE, 2),
('WA1LAAF72KD913846', 'Audi', 'Q5', 'Black', TRUE, 2),
('WDDSJ4EB9EN453678', 'Mercedes', 'GLA', 'Red', FALSE, 2),
('KNDPB3AC4H7012934', 'Kia', 'Sportage', 'Blue', TRUE, 2),
('JM3KFBCM5H0234728', 'Mazda', 'CX-5', 'White', FALSE, 2),
('3VWRF7AT4GM094852', 'Volkswagen', 'Tiguan', 'Silver', FALSE, 3),
('JTMZFREV3HD128745', 'Toyota', 'RAV4', 'Gray', TRUE, 3),
('5J6RW2H59KA123874', 'Honda', 'CR-V', 'Blue', FALSE, 3),
('1FMCU0G66JUB32495', 'Ford', 'Escape', 'Black', TRUE, 3),
('JN8AT2MV2KW120394', 'Nissan', 'Rogue', 'White', FALSE, 3),
('KL8CD6SA7JC152384', 'Chevrolet', 'Trax', 'Red', FALSE, 1),
('KM8K22AA7KU020347', 'Hyundai', 'Kona', 'Silver', TRUE, 1),
('5XYPGDA31KG020384', 'Kia', 'Sorento', 'Blue', FALSE, 1),
('JM1NDAB7G02013492', 'Mazda', 'MX-5', 'Black', TRUE, 1),
('1VWAS7A3XFC110348', 'Volkswagen', 'Passat', 'Gray', FALSE, 1),
('5YJSA1E23GF123847', 'Tesla', 'Model S', 'Red', FALSE, 2),
('WAUD4AF46GN052983', 'Audi', 'A6', 'Blue', TRUE, 2),
('WBA5B3C52ED134852', 'BMW', '5 Series', 'White', FALSE, 2),
('WDDZF4HB9KA123470', 'Mercedes', 'E-Class', 'Silver', TRUE, 2),
('4S4BRCAC1K3457896', 'Subaru', 'Outback', 'Black', FALSE, 2),
('1G1FZ6S00L4112983', 'Chevrolet', 'Bolt', 'Red', FALSE, 3),
('KM8J23A48LU219485', 'Hyundai', 'Tucson', 'Blue', TRUE, 3),
('1N4AZ1CP9LC023485', 'Nissan', 'Leaf', 'White', FALSE, 3),
('1FA6P8TH2K5112489', 'Ford', 'Mustang', 'Gray', TRUE, 3),
('5TDKZ3DC9KS120347', 'Toyota', 'Highlander', 'Silver', FALSE, 3),
('JM3TCBDY7K0312384', 'Mazda', 'CX-9', 'Blue', FALSE, 1),
('3VW117A93JM243569', 'Volkswagen', 'Golf', 'Black', TRUE, 1),
('WBA7E2C55HG123478', 'BMW', '7 Series', 'Gray', FALSE, 1),
('WA1VF8GB8KD112845', 'Audi', 'Q7', 'Silver', TRUE, 1),
('WDDUG8GBXHA120394', 'Mercedes', 'S-Class', 'White', FALSE, 1);

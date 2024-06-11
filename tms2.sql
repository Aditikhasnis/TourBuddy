create database tms2;
use tms2;

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,  -- Assuming password field is added to the Customer model
    name VARCHAR(100) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    country VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL
);

select * from customers;



INSERT INTO customers (username, password, name, gender, country, phone) 
VALUES 
('Aditi', '123', 'Aditi', 'Female', 'USA', '123-456-7890')



CREATE TABLE Packages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    package_name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    persons INT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    customer_age INT NOT NULL,
    gender VARCHAR(10) NOT NULL
);
select * from packages;

drop table packages ;

CREATE TABLE flights (
    id INT AUTO_INCREMENT PRIMARY KEY,
    airline VARCHAR(255) NOT NULL,
    flight_number VARCHAR(20) NOT NULL,
    departure VARCHAR(255) NOT NULL,
    arrival VARCHAR(255) NOT NULL,
    duration VARCHAR(20) NOT NULL,
    destination VARCHAR(255) NOT NULL
);


INSERT INTO flights (airline, flight_number, departure, arrival, duration, destination)
VALUES 
('Japan Airlines', 'JL123', 'New York, 10:00 AM', 'Tokyo, 12:00 PM (next day)', '14 hours', 'Japan'),
('ANA', 'NH456', 'Los Angeles, 1:00 PM', 'Tokyo, 4:00 PM (next day)', '12 hours', 'Japan'),
('Lufthansa', 'LH789', 'New York, 6:00 PM', 'Frankfurt, 7:00 AM (next day)', '8 hours', 'Europe'),
('British Airways', 'BA321', 'Los Angeles, 5:00 PM', 'London, 11:00 AM (next day)', '11 hours', 'Europe'),
('Delta Airlines', 'DL654', 'Tokyo, 9:00 AM', 'New York, 10:00 AM (same day)', '12 hours', 'America'),
('United Airlines', 'UA987', 'Frankfurt, 1:00 PM', 'Chicago, 3:00 PM (same day)', '10 hours', 'America');


CREATE TABLE hotels (
    hotel_name VARCHAR(255) NOT NULL,
    persons INT NOT NULL,
    days INT NOT NULL,
    ac BOOLEAN NOT NULL,
    food_included BOOLEAN NOT NULL,
    total_price DOUBLE NOT NULL
);
select * from hotels;

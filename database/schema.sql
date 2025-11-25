CREATE DATABASE IF NOT EXISTS recipe_db;
USE recipe_db;

CREATE TABLE users(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100),
role VARCHAR(20)
);

CREATE TABLE recipes(
id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(200),
ingredients TEXT,
instructions TEXT,
created_by INT
);

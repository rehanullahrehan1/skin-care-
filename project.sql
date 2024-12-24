-- Create the schema
CREATE SCHEMA IF NOT EXISTS skincareproduct;

-- Switch to the created schema
USE skincareproduct;

-- Create the tables within the selected schema
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100),
    email VARCHAR(100),
    gender VARCHAR(10),
    dob DATE,
    phone VARCHAR(20),
    address VARCHAR(255)
);


-- Create the 'articles' table with the foreign key constraint to 'products'
CREATE TABLE skincareproduct.articles (
    article_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    title VARCHAR(100),
    content TEXT,
    publication_date DATE,
    FOREIGN KEY (product_id) REFERENCES skincareproduct.products(id)
);

-- Create the 'products' table
CREATE TABLE skincareproduct.products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    description TEXT,
    image_url VARCHAR(255),
    category VARCHAR(50)
);
CREATE TABLE Cart (
    cart_id INT AUTO_INCREMENT PRIMARY KEY,
    price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL,
    user_name VARCHAR(100) NOT NULL,
    account_number VARCHAR(50) NOT NULL,
    cvc VARCHAR(10) NOT NULL,
    payment_method VARCHAR(50) NOT NULL,
    address VARCHAR(255) NOT NULL,
    delivery_charges DECIMAL(10, 2) NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL
);

CREATE TABLE ProductsBlog (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100),
    description TEXT,
    image_url VARCHAR(255)
);

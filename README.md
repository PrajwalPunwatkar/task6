**Overview**

This project demonstrates how to connect a Java application to a MySQL database and perform CRUD operations (Create, Read, Update, Delete) using JDBC.
It uses PreparedStatement to prevent SQL injection and handles database resources safely.

**Technologies**

Java 17+

JDBC API

MySQL Database

MySQL Connector/J (JDBC Driver)

**Database Setup**

1.Run the following SQL commands in MySQL:
    ```bash
        CREATE DATABASE testdb;
        
        USE testdb;
        
        CREATE TABLE users (
            id INT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            email VARCHAR(100) NOT NULL UNIQUE
        );

2.JDBC Driver
 download the JAR and add it to your project’s classpath manually.

**Project Structure**
        ```bash
        src/
         └── JDBCExample.java

How It Works

Connects to the database using DriverManager.getConnection().

Inserts user data using PreparedStatement.

Reads and displays users with ResultSet.

Updates user data.

Deletes user data.

Closes all resources in a finally block to prevent leaks.

Running the Project

Make sure MySQL server is running and the database is created.

Add MySQL JDBC driver to the project.

Compile and run JDBCExample.java.

Observe console output for CRUD operations.

Notes

PreparedStatement prevents SQL injection.

Modify JDBC_URL, USER, and PASSWORD according to your MySQL setup.

Final Note

When you’re done and proud of what you’ve built, drop your GitHub repo link through the submission form. Let your work speak for you.

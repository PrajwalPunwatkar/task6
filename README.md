# JDBCExample – Java MySQL CRUD

## 📌 Overview
This is a simple Java program that demonstrates how to connect to a MySQL database using **JDBC** and perform basic **CRUD** operations:

1. **Create** – Insert a new user into the database.
2. **Read** – Fetch and display all users.
3. **Update** – Modify a user's email.
4. **Delete** – Remove a user from the database.

It uses **PreparedStatement** to prevent SQL injection and a `finally` block to close resources.

---

## 🛠 Requirements
- **Java** 8 or higher
- **MySQL** installed and running
- **MySQL JDBC Driver** (Connector/J) added to your classpath
- An IDE like IntelliJ IDEA, Eclipse, or VS Code (optional)

---

## How It Works

- Connects to the database using DriverManager.getConnection().
- Inserts user data using PreparedStatement.
- Reads and displays users with ResultSet.
- Updates user data.
- Deletes user data.
- Closes all resources in a finally block to prevent leaks.

---

## Running the Project

- Make sure MySQL server is running and the database is created.
- Add MySQL JDBC driver to the project.
- Compile and run JDBCExample.java.
- Observe console output for CRUD operations.

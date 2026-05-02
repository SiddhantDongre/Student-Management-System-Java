# 🎓 Student Management System (Java + MySQL)

## 📌 Project Overview

This is a console-based application developed using Java and JDBC to manage student records efficiently. It performs CRUD operations and interacts with a MySQL database.

---

## 🚀 Features

* Add new student
* View all students
* Search student by ID
* Search student by Name
* Update student details
* Delete student

---

## 🧾 Student Details Stored

* ID (Auto Increment)
* Name
* Marks
* Mobile Number
* Address
* Branch

---

## 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

---

## 🗄️ Database Setup

```sql
CREATE DATABASE student_management_db;

USE student_management_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    marks DOUBLE,
    mobile VARCHAR(15),
    address VARCHAR(255),
    branch VARCHAR(50)
);
```

---

## ⚙️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/Student-Management-System-Java.git
```

2. Open in Eclipse
3. Add MySQL Connector (JDBC driver)
4. Update DB username/password in `DBConnection.java`
5. Run `Main.java`

---

## 📸 Output

```
===== Student Management System =====
1. Add Student
2. View All Students
3. Search by ID
4. Search by Name
5. Update Student
6. Delete Student
7. Exit
```

---

## 💡 Future Improvements

* Input validation (marks & mobile)
* GUI (Java Swing / JavaFX)
* Spring Boot Web Version
* Login System

---

## 👨‍💻 Author

Siddhant Dongre

---

⭐ If you like this project, give it a star!


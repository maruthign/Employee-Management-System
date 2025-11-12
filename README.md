# 💼 Employee Management System – Java Swing + MySQL

This project is a **desktop-based Employee Management System (EMS)** built using **Java Swing** and **MySQL**.  
It provides a complete GUI for managing employee data — including modules for **Splash**, **Login**, **Home**, **Add Employee**, and **View Employee**.

---

## 🚀 Features Overview

| Module | Description |
|---------|-------------|
| 🖥 **Splash Screen** | Intro screen with project title and transition to the login window |
| 🔐 **Login Screen** | Secure login form connected to MySQL authentication table |
| 🏠 **Home Dashboard** | Central navigation hub with Add, View, Update, and Remove employee options |
| 👨‍💼 **Add Employee** | Add new employees with DOB picker and auto-generated Employee ID |
| 📋 **View Employee** | View all employees in a JTable, search by ID, and print records |
| 🧩 **Database Connection** | JDBC connection class for reusability across modules |

---

## 🖥️ Splash Screen (`Splash.java`)
- Displays a modern welcome window titled **"Employee Management System"**.  
- Uses `front.jpg` background image with custom font styling.  
- Includes a button **“CLICK HERE TO CONTINUE”** that transitions to the **Login** screen.  
- Acts as the entry point of the project.

---

## 🔐 Login Screen (`Login.java`)
- Simple and secure login form using **Swing** components.  
- Validates credentials from the **MySQL `login` table**.  
- Displays a popup on invalid login attempts.  
- Includes an image (`second.jpg`) for a polished interface.  
- On successful authentication, redirects to the **Home Dashboard**.

---

## 🏠 Home Dashboard (`Home.java`)
- Main control panel after successful login.  
- Contains buttons for navigation:
  - ➕ **Add Employee** — Opens employee registration form.  
  - 👁 **View Employees** — Displays all employee data in a table.  
  - ✏️ **Update Employee** *(Coming Soon)*  
  - ❌ **Remove Employee** *(Coming Soon)*  
- Styled with a background image (`home.jpg`) and clean layout.

---

## 👨‍💼 Add Employee Module (`AddEmployee.java`)
- Allows administrators to add new employee records easily.  
- Features:
  - Auto-generated **Employee ID** using Java `Random`.
  - Uses `JDateChooser` for **Date of Birth** input.
  - Collects personal and professional details:
    - Name  
    - Date of Birth  
    - Salary  
    - Address  
    - Phone  
    - Email  
    - Education  
    - Designation  
    - Aadhar Number  
  - Inserts data into the MySQL `Employee` table via JDBC.
  - Displays success/failure messages via `JOptionPane`.
- Buttons:
  - ✅ **Add** — Saves employee details.  
  - ⬅️ **Back** — Returns to the Home screen.

---

## 📋 View Employee Module (`ViewEmployee.java`)
- Displays all employee records in a **JTable**.  
- Uses `DbUtils` (from `net.proteanit.sql.DbUtils`) for direct `ResultSet` to table conversion.  
- Features:
  - 🔍 **Search by Employee ID** — Quickly filter records.  
  - 🖨 **Print** — Print employee records with header and footer support.  
  - ✏️ **Update** — (Placeholder for next version).  
  - ⬅️ **Back** — Returns to Home.  
- Provides smooth scrolling with `JScrollPane`.

---

## 🧩 Database Connection (`Conn.java`)
- Manages connection to MySQL using JDBC.  
- Reusable across all project modules.  
- Connection details:
  ```java
  String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
  String user = "root";
  String pass = "your_password";

---

## 🗂️ Project Structure
```
  EmployeeManagementSystem/
├── src/
│   └── com/kodnest/employeemanagementsystem/
│       ├── Splash.java
│       ├── Login.java
│       ├── Home.java
│       ├── AddEmployee.java
│       ├── ViewEmployee.java
│       └── Conn.java
└── icons/
    ├── front.jpg
    ├── second.jpg
    └── home.jpg
```
---

## ⚙️ Database Setup (MySQL)

### 1️⃣ Create the Database
```
CREATE DATABASE employeemanagementsystem;
USE employeemanagementsystem;
```
### 2️⃣ Create the login Table
```
CREATE TABLE login (
    username VARCHAR(50),
    password VARCHAR(50)
);
```
#### Insert sample credentials:
```
INSERT INTO login (username, password) VALUES ('admin', 'admin123');
```

### 3️⃣ Create the Employee Table
```
CREATE TABLE Employee (
    empId VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50),
    dob VARCHAR(20),
    phone VARCHAR(15),
    salary VARCHAR(20),
    address VARCHAR(100),
    email VARCHAR(50),
    designation VARCHAR(50),
    education VARCHAR(50),
    aadhar VARCHAR(20)
);
```

---

## ▶️ How to Run

1.	Open the project in your Java IDE (Eclipse / IntelliJ / VS Code).
2.	Ensure your package path matches com.kodnest.employeemanagementsystem.
3.	Add the following JAR files to your project classpath:
-	mysql-connector-j.jar
-	jcalendar.jar (for JDateChooser)
-	rs2xml.jar (for DbUtils)
4.	Place all image files inside the /icons folder.
5.	Start the application by running:

## 🧩 Tech Stack

| Componenet            | Technolgy Used          |
|-----------------------|-----------------------  |
| Language              | Java                    | 
| GUI Framework         | Java Swing              |
| Database              | MySQL                   |
| JDBC Connector        | mysql-connector-j       |
| Additional Libraries  | JCalendar, DbUtils      |
| IDE Support | Eclipse | IntelliJ IDEA / VS Code |
| OS Compatibility      | Windows, macOS, Linux   | 


## 🌟 Future Enhancements

- Implement full Update and Remove Employee functionality.
- Add Employee Search Filters (by name, department, etc.).
-	Implement Password Encryption (BCrypt) for login security.
-	Add Register, Forgot Password, and Admin Dashboard modules.
-	Introduce Validation & Error Handling (email, phone, aadhar).
-	Improve UI using custom colors, gradients, and icons.
-	Export data to Excel or PDF.

## 👨‍💻 Developer Information

- Name: Maruthi G N
- Project: Employee Management System (Swing + MySQL)
- Modules Completed: Splash, Login, Home, Add Employee, View Employee
- Upcoming: Update & Remove Employee
- Tools Used: Java 17+, MySQL 8+, Eclipse IDE

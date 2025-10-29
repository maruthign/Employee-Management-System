# 💼 Employee Management System – Splash, Login, Home, Add Employee & Database Connection

This repository contains the **Splash Screen**, **Login Screen**, **Home Dashboard**, **Add Employee Module**, and **Database Connection** of the *Employee Management System*.  
It is developed using **Java Swing** and **MySQL Database**, providing an interactive GUI and basic CRUD foundation for employee management.

---

## 🚀 Features

### 🖥 Splash Screen (`Splash.java`)
- Welcomes users with the system title and background image  
- “Click Here to Continue” button transitions to the login screen  
- Uses `front.jpg` image with smooth scaling and custom font  
- Clean and minimal design

---

### 🔐 Login Screen (`Login.java`)
- Secure login interface with **username** and **password** fields  
- Verifies credentials using **MySQL database** (`login` table)  
- Redirects to **Home Dashboard** upon successful authentication  
- Displays error popup for invalid login attempts  
- Includes a side image (`second.jpg`) for a professional appearance  

---

### 🏠 Home Dashboard (`Home.java`)
- Main navigation window displayed after successful login  
- Contains four feature buttons:
  - ➕ **Add Employee** — Opens the Add Employee form  
  - 👁 **View Employee** *(To be implemented)*  
  - ✏️ **Update Employee** *(To be implemented)*  
  - ❌ **Remove Employee** *(To be implemented)*  
- Uses `home.jpg` background image with clear, button-based navigation  

---

### 👨‍💼 Add Employee Module (`AddEmployee.java`)
- Form-based interface for adding new employee records  
- Automatically generates a **unique Employee ID** using Java `Random`  
- Uses **JDateChooser** for selecting date of birth  
- Fields include:
  - Name  
  - Date of Birth  
  - Salary  
  - Address  
  - Phone  
  - Email  
  - Education  
  - Designation  
  - Aadhar Number  
  - Employee ID (auto-generated)
- Stores data in the MySQL `Employee` table via JDBC  
- Displays confirmation message upon successful addition  
- “Back” button returns to the Home screen  

---

### 🧩 Database Connection (`Conn.java`)
- Establishes a persistent connection between Java and MySQL  
- Uses `Statement` object for executing SQL queries  
- Reusable across all modules (Login, Add, View, etc.)

---

## 🧠 Code Overview

| Component | Description |
|------------|-------------|
| **Language** | Java |
| **GUI Library** | Swing (`javax.swing`, `java.awt`, `java.awt.event`) |
| **Database** | MySQL |
| **Main Classes** | `Splash`, `Login`, `Home`, `AddEmployee`, `Conn` |
| **Package** | `com.kodnest.employeemanagementsystem` |
| **Images Used** | `/icons/front.jpg`, `/icons/second.jpg`, `/icons/home.jpg` |
| **Flow** | Splash → Login → Home → AddEmployee |

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
│       └── Conn.java
└── icons/
├── front.jpg
├── second.jpg
└── home.jpg
```

---

## ⚙️ Database Configuration

1. Create a MySQL database named **`employeemanagementsystem`**.  
2. Create the **login** table:
   ```sql
   CREATE TABLE login (
       username VARCHAR(50),
       password VARCHAR(50)
   );
   ```
---

## 3.	Insert at least one test credential:
```
INSERT INTO login (username, password) VALUES ('admin', 'admin123');
```
---

## 	4.	Create the Employee table:
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

## 	5.	Update your MySQL credentials in Conn.java:
```
String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
String user = "root";
String pass = "your_password";
```
---

## ▶️ How to Run
1.	Open the project in any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)
2.	Make sure your folder structure matches the package name
3.	Add image files inside the /icons directory
4.	Add MySQL JDBC Driver (mysql-connector-j.jar) to your project classpath
5.	Compile and run the project starting from:

---

### 	6.	Login using the test credentials (e.g., admin / admin123)

---

## 🧩 Future Enhancements
- Implement “View”, “Update”, and “Remove” employee features
- Add user roles (Admin / Employee)
- Integrate password encryption for better security
- Include “Register” and “Forgot Password” options
- Improve UI using icons, hover effects, and animations

---

## 👨‍💻 Developer

- Name: Maruthi G N
- Project: Employee Management System — Splash, Login, Home, Add Employee & Database Connection

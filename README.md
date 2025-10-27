# 💼 Employee Management System – Splash, Login, Home & Database Connection

This repository contains the **Splash Screen**, **Login Screen**, **Home Dashboard**, and **Database Connection** modules of the *Employee Management System*.  
It is developed using **Java Swing** and **MySQL Database**, providing the graphical interface and authentication entry point for the system.

---

## 🚀 Features

### 🖥 Splash Screen (`Splash.java`)
- Displays a welcoming introduction with the system title  
- “Click Here to Continue” button transitions to the login screen  
- Uses background image (`front.jpg`) with smooth scaling and custom font  
- Clean and minimal UI layout  

### 🔐 Login Screen (`Login.java`)
- User authentication interface with **username** and **password** fields  
- Integrates with **MySQL database** for credential verification  
- Redirects to **Home Dashboard** upon successful login  
- Displays an error message for invalid login attempts  
- Uses side image (`second.jpg`) for professional look  

### 🏠 Home Dashboard (`Home.java`)
- Main navigation window after login  
- Displays four functional buttons:
  - ➕ **Add Employee**
  - 👁 **View Employee**
  - ✏️ **Update Employee**
  - ❌ **Remove Employee**
- Designed with a background image (`home.jpg`) and consistent styling  
- Future-ready for feature integration  

### 🧩 Database Connection (`Conn.java`)
- Establishes and maintains a connection between Java and **MySQL**  
- Contains reusable database connectivity logic  
- Simplifies SQL query execution using a shared `Statement` object  

---

## 🧠 Code Overview

| Component | Description |
|------------|-------------|
| **Language** | Java |
| **GUI Library** | Swing (`javax.swing`, `java.awt`, `java.awt.event`) |
| **Database** | MySQL |
| **Main Classes** | `Splash`, `Login`, `Home`, `Conn` |
| **Package** | `com.kodnest.employeemanagementsystem` |
| **Images Used** | `/icons/front.jpg`, `/icons/second.jpg`, `/icons/home.jpg` |
| **Flow** | Splash → Login → Home |

---

## 🗂️ Project Structure
```
EmployeeManagementSystem/
├── src/
│   └── com/kodnest/employeemanagementsystem/
│       ├── Splash.java
│       ├── Login.java
│       ├── Home.java
│       └── Conn.java
└── icons/
├── front.jpg
├── second.jpg
└── home.jpg
```

---

## ⚙️ Database Configuration

1. Create a MySQL database named **`employeemanagementsystem`**.  
2. Inside it, create a table named **`login`** using the following SQL script:

   ```sql
   CREATE TABLE login (
       username VARCHAR(50),
       password VARCHAR(50)
   );
   ```
## 	3.	Insert at least one login credential to test:

   ```
INSERT INTO login (username, password) VALUES ('admin', 'admin123');
```
---

## 	4.	Update your MySQL credentials in Conn.java if necessary:
```
String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
String user = "root";
String pass = "your_password";
```

---

## ▶️ How to Run
1.	Open the project in any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)
2.	Ensure the folder structure matches the package name:
3.	Add the image files inside the /icons directory
4.	Add the MySQL JDBC Driver (mysql-connector-j.jar) to your project classpath
5.	Compile and run the project starting from:

---

## 🧩 Future Enhancements
- Connect Home buttons with actual Employee CRUD modules
- Add user roles (Admin / Employee)
- Implement password encryption for security
- Add registration and forgot password options
- Improve UI with animations and icons

---

## 👨‍💻 Developer
- Name: Maruthi G N
- Project: Employee Management System — GUI Modules (Splash, Login, Home & Database Connection)

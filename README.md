# 💼 Employee Management System – Splash, Login & Database Connection

This repository contains the **Splash Screen**, **Login Screen**, and **Database Connection** modules of the *Employee Management System*.  
It is developed using **Java Swing** and **MySQL Database**, providing the graphical interface and authentication entry point for the system.

---

## 🚀 Features

### 🖥 Splash Screen (`Splash.java`)
- Displays a welcoming introduction with the system title  
- “Click Here to Continue” button transitions to the login screen  
- Uses background image (`front.jpg`) with clean layout  
- Styled with custom fonts and colors  

### 🔐 Login Screen (`Login.java`)
- User authentication interface with **username** and **password** fields  
- Integrates with **MySQL database** for credential verification  
- Shows an error message for invalid login attempts  
- Includes a professional side image (`second.jpg`)  
- Prepared for future role-based dashboard redirection  

### 🧩 Database Connection (`Conn.java`)
- Establishes a connection between the application and **MySQL**  
- Contains reusable database connectivity logic  
- Simplifies SQL query execution via a shared `Statement` object  

---

## 🧠 Code Overview

| Component | Description |
|------------|-------------|
| **Language** | Java |
| **GUI Library** | Swing (`javax.swing`, `java.awt`, `java.awt.event`) |
| **Database** | MySQL |
| **Main Classes** | `Splash`, `Login`, `Conn` |
| **Package** | `com.kodnest.employeemanagementsystem` |
| **Images Used** | `/icons/front.jpg`, `/icons/second.jpg` |
| **Navigation** | Splash → Login → Database Authentication |

---

## 🗂️ Project Structure
```
EmployeeManagementSystem/
├── src/
│   └── com/kodnest/employeemanagementsystem/
│       ├── Splash.java
│       ├── Login.java
│       └── Conn.java
└── icons/
├── front.jpg
└── second.jpg
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
---
```
INSERT INTO login (username, password) VALUES ('username', 'password');

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

1.	Open the project in any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.).
2.	Ensure the folder structure matches the package name (com.kodnest.employeemanagementsystem).
3.	Add the image files in the /icons directory.
4.	Make sure the MySQL JDBC Driver (mysql-connector-j.jar) is added to your project’s classpath.
5.	Compile and run the program:

---

## 🧩 Future Enhancements

- Integrate full employee dashboard after login
- Add role-based access control (Admin / Employee)
- Implement password encryption for better security
- Add user registration and forgot password modules
- Enhance UI with modern design elements (icons, animations)

---
## 👨‍💻 Developer

- Name: Maruthi G N
- Project: Employee Management System — GUI Modules (Splash, Login & Database Connection)

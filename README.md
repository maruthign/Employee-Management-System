# 💼 Employee Management System – Splash & Login Screens

This repository contains the **Splash Screen** and **Login Screen** modules of the *Employee Management System*.  
It is developed using **Java Swing** and provides the initial interface and login entry point for the application.

---

## 🚀 Features

### 🖥 Splash Screen (`Splash.java`)
- Elegant introductory screen with application title and background image  
- “Click Here to Continue” button that opens the login page  
- Clean layout using `JFrame` and `JLabel`  
- Custom font styling and color scheme  

### 🔐 Login Screen (`Login.java`)
- Simple login interface for user authentication  
- Includes username and password input fields  
- Login button for navigation (future backend integration)  
- Embedded image on the right side for a professional look  
- Uses consistent color scheme and layout  

---

## 🧠 Code Overview

| Component | Description |
|------------|-------------|
| **Language** | Java |
| **GUI Library** | Swing (`javax.swing`, `java.awt`, `java.awt.event`) |
| **Main Classes** | `Splash`, `Login` |
| **Package** | `com.kodnest.employeemanagementsystem` |
| **Images Used** | `/icons/front.jpg`, `/icons/second.jpg` |
| **Navigation** | Splash → Login |

---

## 🗂️ Project Structure
```
EmployeeManagementSystem/
├── src/
│   └── com/kodnest/employeemanagementsystem/
│       ├── Splash.java
│       └── Login.java
└── icons/
├── front.jpg
└── second.jpg
```
---

## ⚙️ How to Run

1. Open the project in your preferred IDE (Eclipse, IntelliJ, VS Code, etc.)  
2. Ensure the folder structure matches the package name (`com.kodnest.employeemanagementsystem`).  
3. Add your image files in the `/icons` directory.  
4. Compile and run the program:

   ```bash
   javac com/kodnest/employeemanagementsystem/Splash.java
   java com.kodnest.employeemanagementsystem.Splash


---
## 🧩 Future Enhancements

- Connect login fields with database authentication (MySQL or Firebase)  
- Add user roles (Admin / Employee)  
- Include password encryption for security  
- Implement dashboard after successful login  

---

## 👨‍💻 Developer

**Name:** Maruthi G N  
**Project:** Employee Management System — GUI Modules (Splash & Login)

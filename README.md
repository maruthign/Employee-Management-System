# Employee Management System (Java Swing + MySQL)

A desktop Employee Management System (EMS) built with **Java Swing** and **MySQL**.  
Provides a GUI to **add**, **view**, and **update** employee records with a simple login flow.

---

## 🚀 Project Summary

**Language:** Java  
**UI:** Java Swing  
**Database:** MySQL (JDBC)  
**Extras:** `JDateChooser` (jcalendar), `rs2xml` (DbUtils) for `ResultSet -> JTable` conversion

Modules:
- Splash Screen (`Splash.java`)
- Login (`Login.java`)
- Home Dashboard (`Home.java`)
- Add Employee (`AddEmployee.java`)
- View Employee (`ViewEmployee.java`)
- Update Employee (`UpdateEmployee.java`)
- DB Connection (`Conn.java`)

---

## ✅ Important: Database column name consistency

Your Java code references the employee primary key column as `ID` in several places (e.g. in `ViewEmployee` and `UpdateEmployee`), while elsewhere code uses `empId` (in `AddEmployee` insert order). To avoid SQL errors, use a *single consistent table schema*.

Use the **recommended schema below** (columns without spaces). If you already created a different schema, either rename columns in the DB or change the Java code to match.

---

## 🗂 Recommended MySQL schema (run in MySQL)

```sql
CREATE DATABASE IF NOT EXISTS employeemanagementsystem;
USE employeemanagementsystem;

-- login table (for app login)
CREATE TABLE IF NOT EXISTS login (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(255) NOT NULL
);

INSERT INTO login (username, password) VALUES ('admin', 'admin123');

-- employee table (consistent column names used by the Java code)
CREATE TABLE IF NOT EXISTS Employee (
  ID VARCHAR(20) PRIMARY KEY,
  Name VARCHAR(100),
  DOB VARCHAR(30),
  Phone VARCHAR(20),
  Salary VARCHAR(20),
  Address VARCHAR(150),
  Email VARCHAR(100),
  Designation VARCHAR(100),
  Education VARCHAR(100),
  Aadhar VARCHAR(30)
);
```
### Notes
- ID is used as the primary key in the Java code (so the table uses ID).
- Column names are simple and do not contain spaces (recommended).
- DOB is stored as VARCHAR in your current implementation; you can later change to DATE and adjust code to use java.sql.Date.


---

## 🔌 Dependencies (add to project classpath)
- mysql-connector-j-<version>.jar — JDBC driver
- jcalendar.jar — JDateChooser
- rs2xml.jar — DbUtils (ResultSet → JTable)

- Place these jars in your IDE project’s library/classpath.

---

## ⚙️ Configure database connection

# Open Conn.java and set your DB credentials:
```
String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
String user = "root";
String pass = "your_password_here";  // change this
```

---

## ▶️ How to run
1.	Create the database & tables with the SQL above.
2.	Set DB credentials in Conn.java.
3.	Add required JARs to the project’s classpath.
4.	Compile and run Splash.java (it launches the login screen which flows to Home → Add/View).
  - Or run Login.java directly for quicker testing.


---


## 🧩 Files & Structure
```
EmployeeManagementSystem/
├── src/
│   └── com/kodnest/employeemanagementsystem/
│       ├── Splash.java
│       ├── Login.java
│       ├── Home.java
│       ├── AddEmployee.java
│       ├── ViewEmployee.java
│       ├── UpdateEmployee.java
│       └── Conn.java
└── icons/
    ├── front.jpg
    ├── second.jpg
    └── home.jpg
```

---

## 🔍 Known issues & suggestions (do these to make the app more robust)

1. Inconsistent column names  
   - Make sure your table column names match what the Java code expects (recommended schema above).  
   - Example mismatch in your code: `AddEmployee` inserts a generated `empId` but `ViewEmployee`/`UpdateEmployee` query `ID`. Use `ID` across DB and code.

2. Use `PreparedStatement`  
   - Your code currently builds SQL with string concatenation (vulnerable to SQL injection and syntax errors). Replace `Statement` + string concatenation with `PreparedStatement` for inserts/updates/searches.

3. Standardize date column  
   - If you plan to use date operations later, store `DOB` as `DATE` and convert `JDateChooser`’s value when inserting/updating.

4. Password storage  
   - Store hashed passwords (e.g., BCrypt) instead of plain text for the `login` table.

5. Form validation  
   - Add input validation for phone numbers, email format, Aadhar length, salary numeric checks, required fields, etc.

6. Fix UI labels  
   - `UpdateEmployee` heading currently shows `"Add new Employee"`. Change to `"Update Employee"` for clarity.  
   - Code fix (replace the heading line in `UpdateEmployee` constructor):
     ```java
     JLabel heading = new JLabel("Update Employee");
     ```

7. Error handling & messages  
   - Show user-friendly error messages and log stack traces to console/file only.
  
---

## 🛠 Example: safer INSERT using PreparedStatement (recommended)

  - Replace the current concatenated SQL in AddEmployee with something like:

```
String insertSql = "INSERT INTO Employee (ID, Name, DOB, Phone, Salary, Address, Email, Designation, Education, Aadhar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
PreparedStatement ps = con.con.prepareStatement(insertSql);
ps.setString(1, empId);
ps.setString(2, name);
ps.setString(3, dob);
// ... set other params
ps.executeUpdate();
ps.close();
```
  - Conn already exposes con (a Connection) and s (a Statement), so use con.prepareStatement(...).
---

## 📌 Quick checklist before running
  -	JARs added to classpath (mysql-connector, jcalendar, rs2xml)
	-	MySQL server running
	-	Database and tables created with the recommended schema (or adapted to your code)
	-	Conn.java credentials updated
	-	Images in /icons folder

---

## 📦 Future improvements (next versions)
  -	Implement Remove Employee
	-	Implement Update Employee form (editable fields)
	-	Add search filters (name, designation, salary range)
	-	Export data (Excel/PDF)
	-	Improve UI styling and responsive layout
	-	Add password encryption and role-based access

---

## 👨‍💻 Author

**Maruthi G N** — Employee Management System (Java Swing + MySQL)

If you want, I can:

- provide a fixed `CREATE TABLE` SQL that exactly matches your current Java code (I already included a recommended one above),
- or update your Java snippets to consistently use `ID` and use `PreparedStatement`s across the project — tell me which and I’ll paste the code changes.

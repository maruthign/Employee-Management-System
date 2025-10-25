package com.kodnest.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection con;
    Statement s;
    String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
    String user = "root";
    String pass = "Maru!1122";

    public Conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            s = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.kodnest.employeemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField tfUsername, tfPassword;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel  username = new JLabel("Username");
        username.setBounds(40, 20, 100, 30);
        add(username);

        tfUsername = new JTextField();
        tfUsername.setBounds(150,20,150,30);
        add(tfUsername);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 30);
        add(password);

        tfPassword = new JTextField();
        tfPassword.setBounds(150,70,150,30);
        add(tfPassword);

        JButton login = new JButton("Login");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);


        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfUsername.getText();
            String password = tfPassword.getText();

            Conn c = new Conn();
            String query = "select * from login where username = '" + username + "' and password = '" +  password + "'";
            ResultSet rs = c.s.executeQuery(query);

            if(rs.next()) {
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

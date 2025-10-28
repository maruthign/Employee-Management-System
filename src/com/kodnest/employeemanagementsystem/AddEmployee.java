package com.kodnest.employeemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame {

    Random ran = new Random();
    int number = ran.nextInt(999999);

    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Add new Employee");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN SERIF", Font.BOLD, 25));
        add(heading);


        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        JTextField tfname = new JTextField();
        tfname.setBounds(200, 150, 150,30);
        add(tfname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        JDateChooser dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(450, 150, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        JTextField tfsalary = new JTextField();
        tfsalary.setBounds(600, 150, 150,30);
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(450, 200, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        JTextField tfaddress = new JTextField();
        tfaddress.setBounds(600, 200, 150,30);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);

        JTextField tfphone = new JTextField();
        tfphone.setBounds(200, 250, 150,30);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(450, 250, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        JTextField tfemail = new JTextField();
        tfemail.setBounds(600, 250, 150,30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Education");
        labeleducation.setBounds(450, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        JTextField tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150,30);
        add(tfeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 300, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        JTextField tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 300, 150,30);
        add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(50, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);

        JTextField tfaadhar = new JTextField();
        tfaadhar.setBounds(200, 350, 150,30);
        add(tfaadhar);

        JLabel labelid = new JLabel("Employee ID");
        labelid.setBounds(450, 350, 150, 30);
        labelid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelid);

        JLabel lblid = new JLabel("" + number);
        lblid.setBounds(600, 350, 150, 30);
        lblid.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblid);

        JButton add = new JButton("Add Employee");
        add.setBounds(250, 550, 150, 40);
//      add.addActionListener(this);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLACK);
        add(add);

        JButton back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
//      add.addActionListener(this);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        add(back);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}

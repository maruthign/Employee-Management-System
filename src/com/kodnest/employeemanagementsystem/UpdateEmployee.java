package com.kodnest.employeemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import com.toedter.calendar.JDateChooser;

public class UpdateEmployee extends JFrame implements ActionListener {


    JTextField tfname, tfsalary, tfaddress, tfphone, tfemail, tfeducation, tfaadhar, tfdesignation;
    JDateChooser dcdob;
    JLabel lblid, lbldob, lblname, lblaadhar;
    JButton add, back;
    String empId;

    UpdateEmployee(String empId) {
        this.empId = empId;
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

        lblname = new JLabel();
        lblname.setBounds(200, 150, 150,30);
        add(lblname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(450, 150, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 150, 150,30);
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(450, 200, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(600, 200, 150,30);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        tfphone = new JTextField();
        tfphone.setBounds(200, 250, 150,30);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(450, 250, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(600, 250, 150,30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Education");
        labeleducation.setBounds(450, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150,30);
        add(tfeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 300, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 300, 150,30);
        add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(50, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);

        lblaadhar = new JLabel();
        lblaadhar.setBounds(200, 350, 150,30);
        add(lblaadhar);

        JLabel labelid = new JLabel("Employee ID");
        labelid.setBounds(450, 350, 150, 30);
        labelid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelid);

        lblid = new JLabel();
        lblid.setBounds(600, 350, 150, 30);
        lblid.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblid);

        try {
            Conn c = new Conn();
            String query = "select * from employee where ID = '" + empId + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblname.setText(rs.getString("Name"));
                lbldob.setText(rs.getString("Date of Birth"));
                tfsalary.setText(rs.getString("Salary"));
                tfaddress.setText(rs.getString("Address"));
                tfphone.setText(rs.getString("Phone"));
                tfemail.setText(rs.getString("Email"));
                tfdesignation.setText(rs.getString("Designation"));
                tfeducation.setText(rs.getString("Education"));
                lblaadhar.setText(rs.getString("Aadhar Number"));
                lblid.setText(rs.getString("ID"));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Update");
        add.setBounds(250, 550, 150, 40);
        add.setFont(new Font("serif", Font.BOLD, 20));
        add.addActionListener(this);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLACK);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.setFont(new Font("serif", Font.BOLD, 20));
        back.addActionListener(this);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        add(back);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == add) {
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();

            try {
                Conn c = new Conn();
                // Use backticks only if column names contain spaces. Better: change your DB columns to use underscores.
                String updateSql = "UPDATE `employee` SET `Phone` = ?, `Salary` = ?, `Address` = ?, `Email` = ?, `Designation` = ?, `Education` = ? WHERE `ID` = ?";
                java.sql.PreparedStatement ps = c.con.prepareStatement(updateSql); // assuming Conn exposes Connection as 'con'
                ps.setString(1, phone);
                ps.setString(2, salary);
                ps.setString(3, address);
                ps.setString(4, email);
                ps.setString(5, designation);
                ps.setString(6, education);
                ps.setString(7, empId);

                int updated = ps.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(null, "Details updated successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "No record updated. Check employee ID.");
                }
                ps.close();
                setVisible(false);
                new ViewEmployee();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}

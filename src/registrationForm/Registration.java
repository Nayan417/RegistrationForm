/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationForm;

// Package import
//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registration {
    public static void main(String args[]) {
        MyFrame obj = new MyFrame();
    }
}
class MyFrame extends JFrame implements ActionListener {

    JLabel nameLab, rollNoLab, DOBLab, fatherNameLab, motherNameLab, mobNoLab, emailIdLab, genderLab, addressLab, msgLab;
    JTextField name, rollNo, fatherName, motherName, mobNo, emailId;
    JComboBox day, month, year;
    JRadioButton male, female;
    JTextArea address;
    JCheckBox terms;
    JButton button;

    public MyFrame() {
        // Basic Setup   
        setTitle("Registration Form");
        setSize(800, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        // Taking Name from user
        nameLab = new JLabel("Name");
        nameLab.setBounds(20, 50, 100, 30);
        c.add(nameLab);
        name = new JTextField();
        name.setBounds(130, 50, 170, 30);
        c.add(name);

        // Taking Roll_No from user
        rollNoLab = new JLabel("Roll No");
        rollNoLab.setBounds(20, 100, 100, 30);
        c.add(rollNoLab);
        rollNo = new JTextField();
        rollNo.setBounds(130, 100, 170, 30);
        c.add(rollNo);

        // Taking Father's details
        fatherNameLab = new JLabel("Father's Name");
        fatherNameLab.setBounds(20, 150, 100, 30);
        c.add(fatherNameLab);
        fatherName = new JTextField();
        fatherName.setBounds(130, 150, 170, 30);
        c.add(fatherName);

        // Taking Mother's details
        motherNameLab = new JLabel("Mother's Name");
        motherNameLab.setBounds(20, 200, 100, 30);
        c.add(motherNameLab);
        motherName = new JTextField();
        motherName.setBounds(130, 200, 170, 30);
        c.add(motherName);

        // Taking Mobile No
        mobNoLab = new JLabel("Mobile No");
        mobNoLab.setBounds(20, 250, 100, 30);
        c.add(mobNoLab);
        mobNo = new JTextField();
        mobNo.setBounds(130, 250, 170, 30);
        c.add(mobNo);

        //Taking email_id
        emailIdLab = new JLabel("Email Id");
        emailIdLab.setBounds(20, 300, 100, 30);
        c.add(emailIdLab);
        emailId = new JTextField();
        emailId.setBounds(130, 300, 170, 30);
        c.add(emailId);

        //Taking Data_Of_Berth
        String days[] = {"dd","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String months[] = {"mm","jen", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String years[] = {
            "yy", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014",
            "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000",
            "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988",
            "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975"
        };
        DOBLab = new JLabel("DOB");
        DOBLab.setBounds(20, 350, 100, 30);
        c.add(DOBLab);
        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);
        c.add(day);
        c.add(month);
        c.add(year);

        day.setBounds(130, 350, 70, 30);
        month.setBounds(210, 350, 70, 30);
        year.setBounds(290, 350, 70, 30);

        // Taking Gender
        genderLab = new JLabel("Gender");
        genderLab.setBounds(20, 400, 100, 30);
        c.add(genderLab);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130, 400, 80, 30);
        female.setBounds(210, 400, 80, 30);
        c.add(male);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        // Taking Address
        addressLab = new JLabel("Address");
        addressLab.setBounds(20, 450, 100, 30);
        c.add(addressLab);
        address = new JTextArea();
        address.setBounds(130, 450, 300, 70);
        c.add(address);

        // Terms and Condition
        terms = new JCheckBox("Accept terms and condition");
        terms.setBounds(20, 540, 300, 30);
        c.add(terms);

        // Submit Button
        button = new JButton("Submit");
        button.setBounds(130, 590, 100, 30);
        c.add(button);

        msgLab = new JLabel("");
        msgLab.setBounds(20, 620, 500, 30);
        c.add(msgLab);

        button.addActionListener(this);

        // Screen for showing output
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(rollNo.getText().equals("") || name.getText().equals("") || day.getSelectedItem().equals("dd") || month.getSelectedItem().equals("mm") || year.getSelectedItem().equals("yy")) {
            msgLab.setText("Pleas complete the form before submiting!");
        }
       
        // Verify checkbox is selected or not
        else if (terms.isSelected()) {
            msgLab.setText("Registration Successfull!");
            String temp = male.isSelected() ? "Male" : "Female";
            JLabel gen = new JLabel(temp);
            OutPutFrame obj = new OutPutFrame();
            //OutPutFrame obj = new OutPutFrame(name.getText(), rollNo.getText(), fatherName.getText(), motherName.getText(), mobNo.getText(), emailId.getText(),gen.getText(),address.getText());
        } else {
            msgLab.setText("You have to accept terms and condition for submiting the form!");
        }
    }


//}
// Displaying the output

    class OutPutFrame extends JFrame {

        JTextArea userInfo;
        JLabel msg;

        public OutPutFrame() {
            setSize(700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container cn = getContentPane();
            cn.setLayout(null);
            setTitle("Registration Successfull!");

            msg = new JLabel("");
            msg.setBounds(140, 20, 400, 30);
            cn.add(msg);
            msg.setText("This is your Registration details");

            // Printing details of user
            String Name = name.getText();
            String RollNo = rollNo.getText();
            String dob = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem();
            String MotherName = motherName.getText();
            String FatherName = fatherName.getText();
            String MobNo = mobNo.getText();
            String Email = emailId.getText();
            String Gender = male.isSelected() ? "Male" : "Female";
            String Address = address.getText();

            String data = "\tName : " + Name + "\n\tRoll No : " + RollNo + "\n\tFather's Name : " + FatherName + "\n\tMother's Name" + MotherName + 
                          "\n\tMobile No : " + MobNo + "\n\tEmail Id : " + Email + "\n\tDoB : " + dob + "\n\tGender : " + Gender + "\n\tAddress :  " + Address;
            

            userInfo = new JTextArea();
            userInfo.setBounds(30, 50, 700, 700);
            userInfo.setText(data);
            cn.add(userInfo);

            setVisible(true);
        }
    }
}



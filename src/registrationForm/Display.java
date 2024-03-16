/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationForm;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nayan Mandal
 */
public class Display {
    
}
    class OutPutFrame extends JFrame {
         JLabel nameLab, rollNoLab, DOBLab, fatherNameLab, motherNameLab, mobNoLab, emailIdLab, genderLab, addressLab, msgLab;

        JTextArea userInfo;
        JLabel msg;

        public OutPutFrame(JLabel name, JLabel rollNo, JLabel fatherName,JLabel motherName,JLabel mobNo,JLabel emailId,JLabel gen,JLabel address) {
            setSize(700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container c = getContentPane();
            c.setLayout(null);
            setTitle("Registration Successfull!");

            msg = new JLabel("");
            msg.setBounds(140, 20, 400, 30);
            c.add(msg);
            msg.setText("This is your Registration details");

            // Printing details of user
            // Taking Name from user
        nameLab = new JLabel("Name");
        nameLab.setBounds(20, 50, 100, 30);
        c.add(nameLab);
    //    name = new JTextField();
        name.setBounds(130, 50, 170, 30);
        c.add(name);

        // Taking Roll_No from user
        rollNoLab = new JLabel("Roll No");
        rollNoLab.setBounds(20, 100, 100, 30);
        c.add(rollNoLab);
     //   rollNo = new JTextField();
        rollNo.setBounds(130, 100, 170, 30);
        c.add(rollNo);

        // Taking Father's details
        fatherNameLab = new JLabel("Father's Name");
        fatherNameLab.setBounds(20, 150, 100, 30);
        c.add(fatherNameLab);
     //   fatherName = new JTextField();
        fatherName.setBounds(130, 150, 170, 30);
        c.add(fatherName);

        // Taking Mother's details
        motherNameLab = new JLabel("Mother's Name");
        motherNameLab.setBounds(20, 200, 100, 30);
        c.add(motherNameLab);
     //   motherName = new JTextField();
        motherName.setBounds(130, 200, 170, 30);
        c.add(motherName);

        // Taking Mobile No
        mobNoLab = new JLabel("Mobile No");
        mobNoLab.setBounds(20, 250, 100, 30);
        c.add(mobNoLab);
      //  mobNo = new JTextField();
        mobNo.setBounds(130, 250, 170, 30);
        c.add(mobNo);

        //Taking email_id
        emailIdLab = new JLabel("Email Id");
        emailIdLab.setBounds(20, 300, 100, 30);
        c.add(emailIdLab);
     //   emailId = new JTextField();
        emailId.setBounds(130, 300, 170, 30);
        c.add(emailId);
        
        setVisible(true);
        }
    }
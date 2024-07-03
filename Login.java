package com.mahak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
            JButton rules, back;
            JTextField tfname;

    Login(){
               getContentPane().setBackground(Color.white);
               setLayout(null);

               ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com\\mahak\\login.jpeg"));
               JLabel image = new JLabel(i1);
               image.setBounds(0, 0, 500, 500);
               add(image);

               JLabel heading = new JLabel("Simple MInds");
               heading.setBounds(620, 60, 300, 45);
               heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
               heading.setForeground(new Color(30, 144, 254));
               add(heading);


               JLabel name = new JLabel("Enter your Name");
               name.setBounds(670, 150, 300, 20);
               name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
               name.setForeground(new Color(30, 144, 254));
               add(name);


               tfname = new JTextField();
               tfname.setBounds(635, 220, 200, 25);
               tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
               add(tfname);


               rules = new JButton("Rules");
               rules.setBounds(570, 300, 100, 25);
               rules.setBackground(new Color(30, 144, 254));
               rules.setForeground(Color.white);
               rules.addActionListener(this);
               add(rules);


               back = new JButton("Exit");
               back.setBounds(790, 300, 100, 25);
               back.setBackground(new Color(30, 144, 254));
               back.setForeground(Color.white);
               back.addActionListener(this);
               add(back);


              setSize(1000, 500);
              setLocation(300, 150);
              setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
             
        if (ae.getSource() == rules){
            String name = tfname.getText();
                setVisible(false);
                new Rules(name);
        }
        else if (ae.getSource() == back){
                setVisible(false);
        }

    }

    public static void main(){

        

    }

}

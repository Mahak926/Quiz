package com.mahak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    JButton submit;
        Score(String name, int score){

            setBounds(400, 150, 750, 550);
                
                getContentPane().setBackground(Color.WHITE);
                setLayout(null);


               ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com\\mahak\\score.png"));
               Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
               ImageIcon i3 = new ImageIcon(i2);
               JLabel image = new JLabel(i3);
               image.setBounds(40, 200, 300, 250);
               add(image);



                JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
                heading.setBounds(45, 30, 700, 30);
                heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
                add(heading);

                JLabel lblscore = new JLabel("Your score is " + score);
                lblscore.setBounds(430, 200, 300, 30);
                lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
                add(lblscore);

                submit = new JButton("Play Again");
                submit.setBounds(460, 270, 120, 30);
                submit.setBackground(new Color(30, 144, 225));
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                add(submit);


               JButton back = new JButton("Exit");
               back.setBounds(460, 340, 120, 30);
               back.setBackground(new Color(30, 144, 255));
               back.setForeground(Color.white);
               back.addActionListener(this);
               add(back);

                setVisible(true);

        }


    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        if(ae.getSource() == submit)
        {
            
            new Login();
        }
    }


    public static void main(String[] args){

        new Score("User", 0);

    }


}

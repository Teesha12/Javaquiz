

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel heading = new JLabel("Thankyou " + name  );
        heading.setBounds(250, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score  + " out of 10");
        lblscore.setBounds(250, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        submit.setBounds(250, 270, 170, 40);
   

     
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
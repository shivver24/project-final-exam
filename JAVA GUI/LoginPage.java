import javax.swing.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.*;


public class LoginPage implements ActionListener
{
   JFrame frame = new JFrame("Login");
   JButton loginButton = new JButton("Login");
   JButton resetButton = new JButton("Reset");
   JTextField userField = new JTextField();
   JPasswordField passField = new JPasswordField();
   JLabel userLabel = new JLabel("Username");
   JLabel passLabel = new JLabel("Password");
   JLabel messagLabel = new JLabel("");
   
   ImageIcon i = new ImageIcon("C:/Users/Gabe/Downloads/net.png");
   
   
   HashMap<String,String> logininfo = new HashMap<String,String>();
   
   LoginPage(HashMap<String,String> loginInfoOriginal)
   {
      logininfo = loginInfoOriginal;
      
      userLabel.setBounds(50, 100, 75, 25);
      passLabel.setBounds(50, 150, 75, 25);
      
      messagLabel.setBounds(125, 250, 250, 35);
      messagLabel.setFont(new Font(null, Font.ITALIC, 20));      
      userField.setBounds(125, 100, 200, 25);
      passField.setBounds(125, 150, 200, 25);
      
      loginButton.setBounds(125, 200, 100, 25);
      loginButton.setFocusable(false);
      loginButton.addActionListener(this);
      
      resetButton.setBounds(225, 200, 100, 25);
      resetButton.addActionListener(this);

     
      
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420, 420);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.getContentPane().setBackground(new Color(123,50,250));
      frame.add(userLabel);
      frame.setIconImage(i.getImage());
      frame.add(passLabel);
      frame.add(messagLabel);
      frame.add(userField);
      frame.add(passField);
      frame.add(loginButton);
      frame.add(resetButton);
      
      
   }
   
   @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == resetButton) {
        userField.setText("");
        passField.setText("");
        messagLabel.setText(""); 
    }

    if (e.getSource() == loginButton) {
        String userID = userField.getText();
        String password = String.valueOf(passField.getPassword());

        if (logininfo.containsKey(userID)) {
            if (logininfo.get(userID).equals(password)) 
            {
                
                JOptionPane.showMessageDialog(frame, "Welcome, " + userID + "!","Login Successful", JOptionPane.INFORMATION_MESSAGE);
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(frame,"Incorrect password. Please try again.", "Login Error",JOptionPane.ERROR_MESSAGE);
            }
            
            } 
        
        else 
        {
            JOptionPane.showMessageDialog(frame,"Username not found. Please check your username or register.","Login Error",JOptionPane.ERROR_MESSAGE);
        }
    }
   }

}
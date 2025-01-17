
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,SignUp,Clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i1);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        
        add(text);
        
        
        JLabel cardno=new JLabel("Card No.");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        
       
        
        JLabel pin=new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
       
        pinTextField=new JPasswordField ();
        pinTextField.setBounds(300, 220, 220, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        login=new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        Clear=new JButton("CLEAR ");
        Clear.setBounds(430, 300, 100, 30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        
        SignUp=new JButton("SIGN UP");
        SignUp.setBounds(300, 350, 230, 30);
       SignUp.setBackground(Color.BLACK);
       SignUp.setForeground(Color.WHITE);
       SignUp.addActionListener(this);
        add(SignUp);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== Clear){
         cardTextField.setText("");
         pinTextField.setText("");
      }  else if(ae.getSource()== login){
          Conn conn=new Conn();
          String cardnumber=cardTextField.getText();
          String pinnumber=pinTextField.getText();
          String query ="select * from Login where cardnumber ='"+cardnumber+"' and pin='"+ pinnumber+"'";
          try{
             ResultSet rs=conn.s.executeQuery(query);
             if(rs.next()){
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Icorrect Card Number or pin");
             }
          }catch(Exception e){
              System.out.println(e);
          }
      }else if(ae.getSource()== SignUp){
          setVisible(false);
          new SignupOne().setVisible(true);
      }
    }
    
    
    public static void main(String []args){
        new Login();
    }
}

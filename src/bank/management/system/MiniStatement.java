
package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame {
    MiniStatement(String pinnumber){
        setTitle("MINI Statement");
        
        setLayout(null);
       
        
        JLabel mini=new JLabel();
        add(mini);
        
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card=new JLabel("Card Number");
        card.setBounds(20,80,300,20);
        add(card);
        
        
        JLabel balance=new JLabel();
        balance.setBounds(20,300,300,20);
        add(balance);
        
        
        try{
            Conn conn=new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from login where pin ='"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number  :  " + rs.getString("cardnumber").substring(0,4)+ " XXXX XXXX" + rs.getString("cardnumber").substring(12));
                if(rs.getString("type").equals("deposit")){
                       bal += Integer.parseInt(rs.getString("amount"));
                   }else{
                       bal -= Integer.parseInt(rs.getString("amount"));
                   }
            }
            balance.setText("your current account balance is Rs :"+ bal);
            
        }catch(Exception e){
            System.out.println(e);
        }  
        
        try{
          Conn conn=new Conn();
          ResultSet rs=conn.s.executeQuery("select * from bank where pin= '"+pinnumber+"' ");
          while(rs.next()){
              mini.setText(mini.getText()+ "<html>" +rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>" );
          }
        }catch(Exception e){
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        
        setSize(900,900);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new MiniStatement("");
        
    }
}

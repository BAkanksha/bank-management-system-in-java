
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener{
    
    
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    
    SignupThree(String formno){
        this.formno=formno;
        
        setLayout(null);
        JLabel l1=new JLabel("PAGE 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        
        r1=new JRadioButton("Saving Button");
        r1.setFont(new Font("Releway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
         r2=new JRadioButton("Fixed Deposit Button");
        r2.setFont(new Font("Releway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
         r3=new JRadioButton("Current Button");
        r3.setFont(new Font("Releway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);
        
         r4=new JRadioButton("Recurring Deposit Button");
        r4.setFont(new Font("Releway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        
          groupaccount.add(r2);
            groupaccount.add(r3); 
            groupaccount.add(r4);
            
            
        JLabel card =new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);   
        
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4138");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cardeDetails=new JLabel("This is your 16 DigiteCard Number");
        cardeDetails.setFont(new Font("Raleway",Font.BOLD,12));
        cardeDetails.setBounds(100,330,300,20);
        add(cardeDetails);
        
        
        
         JLabel pin =new JLabel("Pin Number:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);   
        
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pinDetails=new JLabel("your 4 DigitePin Pasword");
        pinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetails.setBounds(100,400,300,20);
        add(pinDetails);
        
        
         JLabel services =new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,230,30);
        add(services);
        
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        
        c3=new JCheckBox("Mobile Banking ");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("raleway",Font.BOLD,16));
        c3.setBounds(100,550,230,30);
        add(c3);
        
        
        c4=new JCheckBox("Email 7 SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        
        c5=new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        
        c6=new JCheckBox("E Statments");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        
        c7=new JCheckBox("I Hereby Declares That The Avobe details are currect to the best of knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(220,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("raleway",Font.BOLD,14));
        cancle.setBounds(450,720,100,30);
        cancle.addActionListener(this);
        add(cancle);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
            
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
               accountType="Saving Account"; 
            }else if(r2.isSelected()){
                accountType="Fixed  Diposit Account";
                
            }else if(r3.isSelected()){
                accountType="Current Account";
                
            }else if(r4.isSelected()){
                accountType="Reccuring Deposit Account";
                
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%9000000L)+5040936000000000L);
            
            String pinnumber=""+Math.abs((random.nextLong()% 9000L+1000L));
            
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM Card";
            }else if(c2.isSelected()){
                facility=facility+"Intenet Banking";
            }else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+"Email & SMS Alart";
            }else if(c5.isSelected()){
                facility=facility+"check book";
            }else if(c6.isSelected()){
                facility=facility+"E-Statment";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is required");
               }else{
                   Conn conn=new Conn();
                   String query1= "insert into signup3 values('"+formno+"' , '"+accountType+"' , '"+cardnumber+"' , '"+pinnumber+"' , '"+facility+"')";
                   String query2= "insert into login values('"+formno+"' , '"+cardnumber+"' , '"+pinnumber+"')";
                   
                   conn.s.executeUpdate(query2);
                   
                   conn.s.executeUpdate(query1);
                   
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);
                   
                  setVisible(false); 
               new Deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            
            
            
        }else if(ae.getSource()== cancle){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    
    
    public static void main(String[]args){
        new SignupThree(""); 
    }
   
}

package bank.management.system;


import javax.swing.*;

import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,adhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category,occupation,education,income;
    String formno;
      JLabel relligon,Category;
    
    
    SignupTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
       
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        
         JLabel additionalDetails=new JLabel("PAGE 2: additional  Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
          relligon=new JLabel("Rellgion:");
        relligon.setFont(new Font("Raleway",Font.BOLD,20));
       relligon.setBounds(100, 140,100, 30);
        add(relligon);
        
        String valReligion[]={"Hindu","Muslim","sikh","christian","Other"};
         religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        
       
        
           Category=new JLabel("Category:");
        Category.setFont(new Font("Raleway",Font.BOLD,20));
       Category.setBounds(100, 190,200, 30);
        add(Category);
        
        
         String valcategory[]={"Gernal","OBC","SC","ST","Other"};
           category=new JComboBox(valcategory);
           category.setBounds(300,190,400,30);
            category.setBackground(Color.WHITE);
        add(category);
        
        
        
         
        
          JLabel Income=new JLabel("Income:");
        Income.setFont(new Font("Raleway",Font.BOLD,20));
       Income.setBounds(100, 240,200, 30);
        add(Income);
        
        
        
        String incomecategory[]={"null","<1,50,000","<2,50,000","<5,00,000","Up to 10,00,000"};
           income=new JComboBox(incomecategory);
           income.setBounds(300,240,400,30);
            income.setBackground(Color.WHITE);
        add(income);
        
        
        
                 
          JLabel Educational=new JLabel("Educational:");
        Educational.setFont(new Font("Raleway",Font.BOLD,20));
       Educational.setBounds(100, 290,200, 30);
        add(Educational);
          
          JLabel Qualification=new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway",Font.BOLD,20));
        Qualification.setBounds(100, 315,200, 30);
        add(Qualification);
        
        
         
        String educationValues[]={"Non-Graduation","Graduation","Post-Graduation","Doctrate","Other"};
           education=new JComboBox(educationValues);
           education.setBounds(300,315,400,30);
            education.setBackground(Color.WHITE);
        add(education);
        
        
        
        
          JLabel Occuation=new JLabel("Occuation:");
        Occuation.setFont(new Font("Raleway",Font.BOLD,20));
        Occuation.setBounds(100, 390,200, 30);
        add(Occuation);
        
        String occupationvalues[]={"Salarid","Self-Employed","Bussiness","Student","Retired","Other"};
         occupation=new JComboBox( occupationvalues);
           occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
      
         
        
        
        
         JLabel Pan=new JLabel("PAN Number:");
        Pan.setFont(new Font("Raleway",Font.BOLD,20));
       Pan.setBounds(100, 440,200, 30);
        add(Pan);
        
        
          pan=new JTextField();
        pan.setFont(new Font("Raieway", Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        
         JLabel aadhar=new JLabel("Adhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
       aadhar.setBounds(100, 490,200, 30);
        add(aadhar);
        
        
          adhar=new JTextField();
          adhar.setFont(new Font("Raieway", Font.BOLD,14));
        adhar.setBounds(300,490,400,30);
        add(adhar);
        
        
        JLabel senior=new JLabel("Senior Citizen:");
         senior.setFont(new Font("Raleway",Font.BOLD,20));
       senior.setBounds(100, 540,200, 30);
        add( senior);
        
        
       syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground( Color.WHITE);
        add(syes);
        
        
        
          sno=new JRadioButton("No");
          sno.setBounds(450,540,100,30);
          sno.setBackground( Color.WHITE);
          add(sno);
          
     
        
        
          
         ButtonGroup sarrietlGroup =new ButtonGroup();
         sarrietlGroup.add(syes);
         sarrietlGroup.add(sno);
      
         
        
        
        
         

        
        JLabel account=new JLabel("Existing Account:");
        account.setFont(new Font("Raleway",Font.BOLD,20));
       account.setBounds(100, 590,200, 30);
        add(account);
        
        
        
         eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground( Color.WHITE);
        add(eyes);
        
        
        
          eno=new JRadioButton("No");
          eno.setBounds(450,590,100,30);
          eno.setBackground( Color.WHITE);
          add(eno);
          
     
        
        
          
         ButtonGroup earrietlGroup =new ButtonGroup();
         earrietlGroup.add(eyes);
         earrietlGroup.add(eno);
      
        
        
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion=(String)religion.getSelectedItem();
       String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
           seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        String existingAccount=null;
        if(eyes.isSelected()){
            existingAccount="Yes";
        }else if(eno.isSelected()){
            existingAccount="No";
        }
        
        String span=pan.getText();
         String saadhar=adhar.getText();
          
           
           try{
              
                   Conn c=new Conn();
                   String query="insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingAccount+"') ";
                   
                   c.s.executeUpdate(query);
                   
                   
                   //Signup3 object
                   
                   setVisible(false);
                   new SignupThree(formno).setVisible(true);
                   
                   
               
           }catch(Exception ex){
               System.out.println(ex);
           }
           
    }
    
    
    
    
    public static void main(String[]args){
        new SignupTwo("");
    }
}

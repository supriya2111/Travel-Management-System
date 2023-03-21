
package travel.management.system;



import java.sql.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ViewPackage extends JFrame implements  ActionListener{
    
    JLabel lblusername ,labelusername , lblid , labelpackage , lblnumber , labelperson, lblname, labelid , lblgender, labelnumber,labelprice;
    JLabel lblcountry,labelcountry ,lblph ,labelph, lblemail, labelemail,lbladdress,labeladdress;
    JButton back;

    public ViewPackage(String username)  {
        
        setBounds(450,200,900,455);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
                        
        lblusername = new JLabel("USERNAME");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
        lblid = new JLabel("Package");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        lblnumber = new JLabel("Total Persons");
        lblnumber .setBounds(30,130,150,25);
        add(lblnumber );
        
        labelperson = new JLabel();
        labelperson.setBounds(220,130,150,25);
        add(labelperson);
        
        lblname = new JLabel("ID");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
        lblgender = new JLabel("NUMBER");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);
        
        lblcountry = new JLabel("PHONE NO");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        labelph = new JLabel();
        labelph.setBounds(220,250,150,25);
        add(labelph);
        
        lbladdress = new JLabel("PRICE");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,20,500,400);
        add(image);
        
        try {
             
             Conn conn = new Conn();
             String query = "select * from  bookPackage where username = '"+username+"'";
             ResultSet rs = conn.s.executeQuery(query);
             while (rs.next()) {                 
                 labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("id"));
                 labelnumber.setText(rs.getString("number"));
                 labelpackage.setText(rs.getString("package"));
                 labelprice.setText(rs.getString("price"));
                 labelperson.setText(rs.getString("persons"));
                 labelph.setText(rs.getString("phone"));
                
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new ViewPackage("sanket");
    }
    
}


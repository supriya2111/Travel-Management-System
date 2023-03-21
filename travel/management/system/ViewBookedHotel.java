
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class ViewBookedHotel extends JFrame implements  ActionListener{
    
    JLabel lblusername ,labelusername , lblid , labelpackage , labelid , labelnumber,lblnumber,labelprice;
    JLabel lblph ,labelph, lblac, labelac;
    JLabel lblname ,labelname ,lblperson, labelperson , lblprice , lbldays,labeldays , lblfood , labelfood;
    JButton back;

    public ViewBookedHotel(String username)  {
        
        setBounds(400,200,1000,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);
                        
        lblusername = new JLabel("USERNAME");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
        lblname = new JLabel("Hotel Name");
        lblname.setBounds(30,90,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,90,150,25);
        add(labelname);
        
        lblperson = new JLabel("Total Persons");
        lblperson .setBounds(30,130,150,25);
        add(lblperson );
        
        labelperson = new JLabel();
        labelperson.setBounds(220,130,150,25);
        add(labelperson);
        
        lbldays = new JLabel("Total Days");
        lbldays .setBounds(30,170,150,25);
        add(lbldays);
        
        labeldays = new JLabel();
        labeldays.setBounds(220,170,150,25);
        add(labeldays);
                
        lblac = new JLabel("AC / Non-AC");
        lblac.setBounds(30,210,150,25);
        add(lblac);
        
        labelac = new JLabel();
        labelac.setBounds(220,210,150,25);
        add(labelac);
        
        lblfood = new JLabel("Food Included?");
        lblfood.setBounds(30,250,150,25);
        add(lblfood);
        
        labelfood = new JLabel();
        labelfood.setBounds(220,250,150,25);
        add(labelfood);

        lblid = new JLabel("ID");
        lblid.setBounds(30,290,150,25);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(220,290,150,25);
        add(labelid);
        
        lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,330,150,25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(220,330,150,25);
        add(labelnumber);


        lblph = new JLabel("PHONE NO");
        lblph.setBounds(30,370,150,25);
        add(lblph);
        
        labelph = new JLabel();
        labelph.setBounds(220,370,150,25);
        add(labelph);
        
        lblprice = new JLabel("Total Cost");
        lblprice.setBounds(30,410,150,25);
        add(lblprice);
        
        labelprice = new JLabel();
        labelprice.setBounds(220,410,150,25);
        add(labelprice);
        
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,460,100,25);
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
             String query = "select * from  bookHotel where username = '"+username+"'";
             ResultSet rs = conn.s.executeQuery(query);
             while (rs.next()) {                 
                 labelusername.setText(rs.getString("username"));
                 labelname.setText(rs.getString("name"));
                 labelid.setText(rs.getString("id"));
                 labelnumber.setText(rs.getString("number"));
                 labelprice.setText(rs.getString("price"));
                 labelperson.setText(rs.getString("persons"));
                 labelph.setText(rs.getString("phone"));
                 labelfood.setText(rs.getString("food"));
                 labelac.setText(rs.getString("ac"));
                 labeldays.setText(rs.getString("days"));
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
        new ViewBookedHotel("sanket");
    }
    
}


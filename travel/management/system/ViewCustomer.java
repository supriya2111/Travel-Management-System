
package travel.management.system;


import java.sql.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ViewCustomer extends JFrame implements  ActionListener{
    
    JLabel lblusername ,labelusername , lblid , labelid , lblno, labelno, lblname, labelname , lblgender, labelgender;
    JLabel lblcountry,labelcountry ,lblph ,labelph, lblemail, labelemail,lbladdress,labeladdress;
    JButton back;

    public ViewCustomer(String username)  {
        
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        lblusername = new JLabel("USERNAME");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
        lblid = new JLabel("ID");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        lblno = new JLabel("Number");
        lblno.setBounds(30,170,150,25);
        add(lblno);
        
        labelno = new JLabel();
        labelno.setBounds(220,170,150,25);
        add(labelno);
        
        lblname = new JLabel("NAME");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
        lblgender = new JLabel("GENDER");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        labelgender = new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
        lblcountry = new JLabel("COUNTRY");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
        labelcountry = new JLabel();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
        lbladdress = new JLabel("ADDRESS");
        lbladdress.setBounds(500,110,150,25);
        add(lbladdress);
        
        labeladdress = new JLabel();
        labeladdress.setBounds(690,110,150,25);
        add(labeladdress);
        
        
        lblph = new JLabel("PH NO");
        lblph.setBounds(500,170,150,25);
        add(lblph);
        
        labelph = new JLabel();
        labelph.setBounds(690,170,150,25);
        add(labelph);
        
        lblemail = new JLabel("EMAIL");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        labelemail = new JLabel();
        labelemail.setBounds(690,230,150,25);
        add(labelemail);
        
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600,400,600,200);
        add(image2);

         try {
             
             Conn conn = new Conn();
             String query = "select *from customer where username = '"+username+"'";
             ResultSet rs = conn.s.executeQuery(query);
             while (rs.next()) {                 
                 labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("id"));
                 labelno.setText(rs.getString("number"));
                 labelname.setText(rs.getString("name"));
                 labelgender.setText(rs.getString("gender"));
                 labelcountry.setText(rs.getString("country"));
                 labeladdress.setText(rs.getString("address"));
                 labelph.setText(rs.getString("phone"));
                 labelemail.setText(rs.getString("email"));
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
        new ViewCustomer("sanket");
    }
    
}


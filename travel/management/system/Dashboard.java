
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{

    JPanel p1,p2;
    JLabel heading;
    JButton addpersonaldetails , updatepersonaldetails , viewpersonaldetails ,deletepersonaldetails;
    JButton checkpackage ,bookpackage , viewpackage ,viewhotels,bookhotel, viewbookedhotel;
    JButton payment, calculator,notepad,exit,destination,about;
    String username;
    
    public Dashboard(String username) {
        
        this.username=username;
        
        setBounds(0,0,1600,1000);
        setLayout(null);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icons = new JLabel(i3);
        icons.setBounds(0,0,70,70);
        p1.add(icons);
        
        heading = new JLabel("DASHBOARD");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahuma",Font.BOLD,30));
        p1.add(heading);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addpersonaldetails = new JButton("Add Personal Details");
        addpersonaldetails.setBounds(0,0,300,50);
        addpersonaldetails.setBackground(new Color(0,0,102));
        addpersonaldetails.setForeground(Color.WHITE);
        addpersonaldetails.setFont(new Font("Tahuma",Font.BOLD,20));
        addpersonaldetails.setMargin(new Insets(0,0,0,60));
        addpersonaldetails.addActionListener(this);
        p2.add(addpersonaldetails);
        
        updatepersonaldetails = new JButton("Update Personal Details");
        updatepersonaldetails.setBounds(0,50,300,50);
        updatepersonaldetails.setBackground(new Color(0,0,102));
        updatepersonaldetails.setForeground(Color.WHITE);
        updatepersonaldetails.setFont(new Font("Tahuma",Font.BOLD,20));
        updatepersonaldetails.setMargin(new Insets(0,0,0,30));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);
        
        viewpersonaldetails = new JButton("View Details");
        viewpersonaldetails.setBounds(0,100,300,50);
        viewpersonaldetails.setBackground(new Color(0,0,102));
        viewpersonaldetails.setForeground(Color.WHITE);
        viewpersonaldetails.setFont(new Font("Tahuma",Font.BOLD,20));
        viewpersonaldetails.setMargin(new Insets(0,0,0,120));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);
        
        
        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0,150,300,50);
        deletepersonaldetails.setBackground(new Color(0,0,102));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont(new Font("Tahuma",Font.BOLD,20));
        deletepersonaldetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletepersonaldetails);
        
        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0,150,300,50);
        deletepersonaldetails.setBackground(new Color(0,0,102));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont(new Font("Tahuma",Font.BOLD,20));
        deletepersonaldetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletepersonaldetails);
        
        checkpackage = new JButton("Check Package");
        checkpackage.setBounds(0,200,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahuma",Font.BOLD,20));
        checkpackage.setMargin(new Insets(0,0,0,100));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahuma",Font.BOLD,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahuma",Font.BOLD,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahuma",Font.BOLD,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahuma",Font.BOLD,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahuma",Font.BOLD,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahuma",Font.BOLD,20));
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);

        payment = new JButton("Payment");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahuma",Font.BOLD,20));
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahuma",Font.BOLD,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahuma",Font.BOLD,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahuma",Font.BOLD,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text=new JLabel("Travels and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addpersonaldetails){
            new AddCustomer(username);
        }else if(ae.getSource()== viewpersonaldetails){
            new ViewCustomer(username);
        }else if(ae.getSource()== updatepersonaldetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()== checkpackage){
            new CheckPackage();
        }else if(ae.getSource()== bookpackage){
            new BookPackage(username);
        }else if(ae.getSource()== viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource()== viewhotels){
            new CheckHotels();
        }else if(ae.getSource()== destination){
            new Destinations();
        }else if(ae.getSource()== bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()== viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()== payment){
            new Payment();
        }else if(ae.getSource()== calculator){
            try{
               Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()== notepad){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()== about){
            new About();
        }
    }   
    public static void main(String[] args) {
        new Dashboard("sanket");
    }
    
}

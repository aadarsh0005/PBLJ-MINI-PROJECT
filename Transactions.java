//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*; // Required for ActionListener
//
//public class Transactions extends JFrame implements ActionListener {
//
//    // Global button declarations
//    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;
//    String pinnumber;
//
//    Transactions(String pinnumber) {
//        this.pinnumber = pinnumber;
//        setLayout(null);
//          
//     // Background image
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 0, 900, 900);
//        add(image);
//
//        // Label
//        JLabel text = new JLabel("Please select your Transaction");
//        text.setBounds(210, 300, 700, 35);                     
//        text.setForeground(Color.WHITE);                      
//        text.setFont(new Font("System", Font.BOLD, 16));       
//        image.add(text); 
//
//        // Buttons with action listeners
//        deposit = new JButton("Deposit");
//        deposit.setBounds(170, 415, 150, 30);
//        deposit.addActionListener(this);
//        image.add(deposit);
//
//        withdrawl = new JButton("Cash Withdrawl");
//        withdrawl.setBounds(335, 415, 150, 30);
//        withdrawl.addActionListener(this);
//        image.add(withdrawl);
//
//        fastcash = new JButton("Fast Cash");
//        fastcash.setBounds(170, 450, 150, 30);
//        fastcash.addActionListener(this);
//        image.add(fastcash);
//
//        ministatement = new JButton("Mini Statement");
//        ministatement.setBounds(335, 450, 150, 30);
//        ministatement.addActionListener(this);
//        image.add(ministatement);
//
//        pinchange = new JButton("Pin Change");
//        pinchange.setBounds(170, 485, 150, 30);
//        pinchange.addActionListener(this);
//        image.add(pinchange);
//
//        balanceenquiry = new JButton("Balance Enquiry");
//        balanceenquiry.setBounds(335, 485, 150, 30);
//        balanceenquiry.addActionListener(this);
//        image.add(balanceenquiry);
//
//        exit = new JButton("Exit");
//        exit.setBounds(335, 520, 150, 30);
//        exit.addActionListener(this);
//        image.add(exit);
//
//        // Frame settings
//        setSize(900, 900);
//        setLocation(300, 0);
////        setUndecorated(true);
//        setVisible(true);
//    }
//
//    // Handle button actions
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == deposit) {
//            System.out.println("Deposit button clicked");
//        } else if (e.getSource() == withdrawl) {
//            System.out.println("Cash Withdrawl button clicked");
//        } else if (e.getSource() == fastcash) {
//            System.out.println("Fast Cash button clicked");
//        } else if (e.getSource() == ministatement) {
//            System.out.println("Mini Statement button clicked");
//        } else if (e.getSource() == pinchange) {
//            System.out.println("Pin Change button clicked");
//        } else if (e.getSource() == balanceenquiry) {
//            System.out.println("Balance Enquiry button clicked");
//        } else if (e.getSource() == exit) {
//            System.out.println("Exit button clicked");
//            System.exit(0);
//        }else if (e.getSource() == deposit) {
//    setVisible(false);
//    new Deposite(pinnumber).setVisible(true);
//}
//
//
//    }
//
//    public static void main(String[] args) {
//        new Transactions(" ");
//    }
//}





package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {

    // Global button declarations
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;
    String pinnumber;

    // Constructor for Transactions screen
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        // Text label
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        // Deposit button
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        // Other buttons
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(335, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(335, 450, 150, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(335, 485, 150, 30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(335, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

       
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deposit) {
            setVisible(false);
            new Deposite(pinnumber).setVisible(true); // Open Deposite window
            
        } else if (e.getSource() == withdrawl) {
            System.out.println("Cash Withdrawal button clicked");
             setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        
        } else if (e.getSource() == fastcash) {
            System.out.println("Fast Cash button clicked");
             setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
            
        } else if (e.getSource() == ministatement) {
            System.out.println("Mini Statement button clicked");
        } else if (e.getSource() == pinchange) {
            System.out.println("Pin Change button clicked");
        } else if (e.getSource() == balanceenquiry) {
            System.out.println("Balance Enquiry button clicked");
        } else if (e.getSource() == exit) {
            System.out.println("Exit button clicked");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transactions("1234"); 
    }
}



        

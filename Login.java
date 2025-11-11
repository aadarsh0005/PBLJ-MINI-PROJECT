package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 

public class Login extends JFrame implements ActionListener {

    JTextField cardField;
    JPasswordField pinField;
    JButton SIGNINButton, CLEARButton, SIGNUPButton;

    Login() {
        setTitle("Automated Teller Machine");
        setSize(800, 480);
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(Color.white);

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(50, 30, 100, 100);
        add(logoLabel);

        JLabel textLabel = new JLabel("Welcome to Bank");
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(Color.BLACK);
        textLabel.setBounds(200, 40, 400, 40);
        add(textLabel);

        JLabel cardLabel = new JLabel("Card No:");
        cardLabel.setFont(new Font("Arial", Font.BOLD, 18));
        cardLabel.setBounds(120, 150, 150, 40);
        add(cardLabel);

        cardField = new JTextField();
        cardField.setBounds(300, 150, 250, 40);
        add(cardField);

        JLabel pinLabel = new JLabel("PIN No:");
        pinLabel.setFont(new Font("Arial", Font.BOLD, 18));
        pinLabel.setBounds(120, 220, 400, 40);
        add(pinLabel);

        pinField = new JPasswordField();
        pinField.setBounds(300, 220, 250, 30);
        add(pinField);

        SIGNINButton = new JButton("SIGNIN");
        SIGNINButton.setFont(new Font("Arial", Font.BOLD, 16));
        SIGNINButton.setBounds(300, 300, 100, 30);
        SIGNINButton.addActionListener(this);
        add(SIGNINButton);

        CLEARButton = new JButton("CLEAR");
        CLEARButton.setFont(new Font("Arial", Font.BOLD, 16));
        CLEARButton.setBounds(430, 300, 100, 30);
        CLEARButton.addActionListener(this);
        add(CLEARButton);

        SIGNUPButton = new JButton("SIGNUP");
        SIGNUPButton.setFont(new Font("Arial", Font.BOLD, 16));
        SIGNUPButton.setBounds(300, 350, 230, 30);
        SIGNUPButton.addActionListener(this);
        add(SIGNUPButton);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == CLEARButton) {
            cardField.setText("");
            pinField.setText("");
        } 
        
        
        else if (ae.getSource() == SIGNINButton) {
    String cardnumber = cardField.getText();
    String pinnumber = String.valueOf(pinField.getPassword());

    try {
        Conn conn = new Conn();
       String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";

        ResultSet rs = conn.s.executeQuery(query);
        
        if (rs.next()) {
            // Login successful
            setVisible(false);
            new Transactions(pinnumber); // Open Transactions window
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}

        
        
        
else if (ae.getSource() == SIGNUPButton) {
            JOptionPane.showMessageDialog(null, "Want to signup");
            setVisible(false);
            new Signupone().setVisible(true);
            
            
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}





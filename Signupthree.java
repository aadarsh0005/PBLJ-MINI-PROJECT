package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signupthree extends JFrame implements ActionListener {
    JButton submit, cancel;

    JRadioButton saving, fixed, current, recurring;
    JCheckBox atm, internetBanking, mobileBanking, emailSmsAlert, checkBook, eStatement, declarationLabel,pinnumber;
    String formno;
    Signupthree(String formno) {
        this.formno=formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.WHITE);
        saving.setBounds(100, 180, 150, 30);
        add(saving);

        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway", Font.BOLD, 16));
        fixed.setBackground(Color.WHITE);
        fixed.setBounds(350, 180, 200, 30);
        add(fixed);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.WHITE);
        current.setBounds(100, 220, 150, 30);
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBackground(Color.WHITE);
        recurring.setBounds(350, 220, 250, 30);
        add(recurring);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(saving);
        accountGroup.add(fixed);
        accountGroup.add(current);
        accountGroup.add(recurring);

        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4318");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel PIN = new JLabel("PIN:");
        PIN.setFont(new Font("Raleway", Font.BOLD, 22));
        PIN.setBounds(100, 370, 200, 30);
        add(PIN);

        JLabel pindetail = new JLabel("Your 4 Digit Passsword");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 250, 30);
        add(services);

        atm = new JCheckBox("ATM CARD");
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Raleway", Font.BOLD, 16));
        atm.setBounds(100, 500, 150, 30);
        add(atm);

        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setBackground(Color.WHITE);
        internetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBanking.setBounds(350, 500, 200, 30);
        add(internetBanking);

        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setBackground(Color.WHITE);
        mobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBanking.setBounds(100, 540, 150, 30);
        add(mobileBanking);

        emailSmsAlert = new JCheckBox("EMAIL/SMS Alerts");
        emailSmsAlert.setBackground(Color.WHITE);
        emailSmsAlert.setFont(new Font("Raleway", Font.BOLD, 16));
        emailSmsAlert.setBounds(350, 540, 200, 30);
        add(emailSmsAlert);

        checkBook = new JCheckBox("Check Book");
        checkBook.setBackground(Color.WHITE);
        checkBook.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBook.setBounds(100, 580, 150, 30);
        add(checkBook);

        eStatement = new JCheckBox("E-Statement");
        eStatement.setBackground(Color.WHITE);
        eStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatement.setBounds(350, 580, 200, 30);
        add(eStatement);

        declarationLabel = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        declarationLabel.setFont(new Font("Raleway", Font.BOLD, 16));
        declarationLabel.setBounds(100, 620, 700, 30);
        add(declarationLabel);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(220, 720, 100, 30);
        submit.addActionListener(this); // <-- ActionListener added here
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String accountType = null;
            if (saving.isSelected()) {
                accountType = "Saving Account";
            } else if (fixed.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (current.isSelected()) {
                accountType = "Current Account";
            } else if (recurring.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();
//            String cardnumber = "" + Math.abs(random.nextLong() % 90000000L) + 5040936000000000L;
//            String pinnumber = "" + Math.abs(random.nextLong() % 9000L + 1000L);
            
            
            long first8 = (Math.abs(random.nextLong()) % 90000000L) + 10000000L; // Ensures 8 digits
            long last8 = (Math.abs(random.nextLong()) % 90000000L) + 10000000L;  // Ensures 8 digits
            String cardnumber = "" + first8 + last8;  // Final 16-digit card number
            int pin = random.nextInt(9000) + 1000;
            String pinnumber = String.valueOf(pin);

            String services = "";
            if (atm.isSelected()) services += " ATM Card";
            if (internetBanking.isSelected()) services += " Internet Banking";
            if (mobileBanking.isSelected()) services += " Mobile Banking";
            if (emailSmsAlert.isSelected()) services += " Email/SMS Alerts";
            if (checkBook.isSelected()) services += " Check Book";
            if (eStatement.isSelected()) services += " E-Statement";
           if (accountType == null) {
                JOptionPane.showMessageDialog(null, "Please select an Account Type");
            } else if (!declarationLabel.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please accept the declaration");
            } else {
               try {
                    if (accountType.equals("")) {
                        JOptionPane.showMessageDialog(null, "Account Type is Required");
                    } else {
                        Conn conn = new Conn();
                       String query1 = "INSERT INTO signupthree (formno, accountType, cardnumber, pinnumber, services) VALUES('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + services + "')";
                       String query2 = "INSERT INTO login (formno, cardnumber, pinnumber) VALUES('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                       conn.s.executeUpdate(query1);
                       conn.s.executeUpdate(query2);
                       JOptionPane.showMessageDialog(null, "Account Created!\nType: " + accountType + "\nServices: " + services);
                       JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                       setVisible(false);
                       new Deposite(pinnumber).setVisible(false);
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } 

        }
    }
            
    

    public static void main(String[] args) {
        new Signupthree("");
    }
}


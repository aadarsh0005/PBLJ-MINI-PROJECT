package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    JTextField amount;
    JButton Withdraw, back;
    String pinnumber;

    // Constructor receives pinNumber
    Withdrawl(String pinnumber) {
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
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        // Textfield for amount
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);

        // Deposit button
        Withdraw = new JButton("Withdrawl");
         Withdraw.setBounds(355, 485, 150, 30);
        Withdraw.addActionListener(this);
        image.add( Withdraw);

        // Back button
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        // Frame settings
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    // Action listener for deposit and back buttons
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Withdraw) {
            String amountValue = amount.getText();
            Date date = new Date();

            if (amountValue.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter an amount to withdraw");
            } else {
                try {
                    Conn conn = new Conn();
                    String query = "INSERT INTO bank (pin, date, type, amount) VALUES ('" + pinnumber + "', '" + date + "', 'Withdrawl', '" + amountValue + "')";
                    conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "₹" + amountValue + " Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error while depositing amount");
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true); // Go back to Transactions window
        }
    }

    public static void main(String args[]) {
        new Deposite("1234"); // Pass a sample pinNumber for testing purposes
    }
}

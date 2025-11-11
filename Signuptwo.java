//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Signuptwo extends JFrame implements ActionListener {
//
//    JTextField panTextField, aadharTextField;
//    JRadioButton male, female, seniorYes, seniorNo, existingYes, existingNo;
//    JButton next;
//    long formno;
//    JComboBox<String> religionComboBox, categoryComboBox, incomeComboBox, occupationComboBox, qualificationComboBox;
//
//    // Global variables for data retrieval
//    String religion, category, income, education, qualification, occupation, pan, aadhar, seniorCitizen, existingAccount;
//
//    Signuptwo(String formno) {
//        
//        setLayout(null);
//
//        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
//
//        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
//        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
//        additionalDetails.setBounds(290, 80, 400, 30);
//        add(additionalDetails);
//
//        JLabel religionLabel = new JLabel("Religion:");
//        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        religionLabel.setBounds(100, 140, 200, 30);
//        add(religionLabel);
//
//        String[] religionOptions = {"Hindu", "Muslim", "Christian", "Other"};
//        religionComboBox = new JComboBox<>(religionOptions);
//        religionComboBox.setBounds(300, 140, 400, 30);
//        religionComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
//        add(religionComboBox);
//
//        JLabel categoryLabel = new JLabel("Category:");
//        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        categoryLabel.setBounds(100, 190, 200, 30);
//        add(categoryLabel);
//
//        String[] categoryOptions = {"General", "OBC", "SC", "ST", "Other"};
//        categoryComboBox = new JComboBox<>(categoryOptions);
//        categoryComboBox.setBounds(300, 190, 400, 30);
//        categoryComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
//        add(categoryComboBox);
//
//        JLabel incomeLabel = new JLabel("Income:");
//        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        incomeLabel.setBounds(100, 240, 200, 30);
//        add(incomeLabel);
//
//        String[] incomeOptions = {"Null", "<150000", "<250000", "500000", "upto 1000000"};
//        incomeComboBox = new JComboBox<>(incomeOptions);
//        incomeComboBox.setBounds(300, 240, 400, 30);
//        incomeComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
//        add(incomeComboBox);
//
//        JLabel educationLabel = new JLabel("Educational");
//        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        educationLabel.setBounds(100, 290, 200, 30);
//        add(educationLabel);
//
//        JLabel qualificationLabel = new JLabel("Qualification:");
//        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        qualificationLabel.setBounds(100, 320, 200, 30);
//        add(qualificationLabel);
//
//        String[] qualificationOptions = {"Non-Graduate", "Graduate", "Post-Graduation", "Others"};
//        qualificationComboBox = new JComboBox<>(qualificationOptions);
//        qualificationComboBox.setBounds(300, 320, 400, 30);
//        qualificationComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
//        add(qualificationComboBox);
//
//        JLabel occupationLabel = new JLabel("Occupation:");
//        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        occupationLabel.setBounds(100, 390, 200, 30);
//        add(occupationLabel);
//
//        String[] occupationOptions = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
//        occupationComboBox = new JComboBox<>(occupationOptions);
//        occupationComboBox.setBounds(300, 390, 400, 30);
//        occupationComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
//        add(occupationComboBox);
//
//        JLabel panLabel = new JLabel("PAN Number:");
//        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        panLabel.setBounds(100, 440, 200, 30);
//        add(panLabel);
//
//        panTextField = new JTextField();
//        panTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
//        panTextField.setBounds(300, 440, 400, 30);
//        add(panTextField);
//
//        JLabel aadharLabel = new JLabel("Aadhar Number:");
//        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        aadharLabel.setBounds(100, 490, 200, 30);
//        add(aadharLabel);
//
//        aadharTextField = new JTextField();
//        aadharTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
//        aadharTextField.setBounds(300, 490, 400, 30);
//        add(aadharTextField);
//
//        JLabel seniorCitizenLabel = new JLabel("Senior Citizen:");
//        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        seniorCitizenLabel.setBounds(100, 540, 200, 30);
//        add(seniorCitizenLabel);
//
//        seniorYes = new JRadioButton("Yes");
//        seniorYes.setBounds(300, 540, 100, 30);
//        seniorYes.setBackground(Color.WHITE);
//        seniorYes.setFocusPainted(false);
//        add(seniorYes);
//
//        seniorNo = new JRadioButton("No");
//        seniorNo.setBounds(400, 540, 100, 30);
//        seniorNo.setBackground(Color.WHITE);
//        seniorNo.setFocusPainted(false);
//        add(seniorNo);
//
//        ButtonGroup seniorGroup = new ButtonGroup();
//        seniorGroup.add(seniorYes);
//        seniorGroup.add(seniorNo);
//
//        JLabel existingAccountLabel = new JLabel("Existing Account:");
//        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        existingAccountLabel.setBounds(100, 590, 200, 30);
//        add(existingAccountLabel);
//
//        existingYes = new JRadioButton("Yes");
//        existingYes.setBounds(300, 590, 100, 30);
//        existingYes.setBackground(Color.WHITE);
//        existingYes.setFocusPainted(false);
//        add(existingYes);
//
//        existingNo = new JRadioButton("No");
//        existingNo.setBounds(400, 590, 100, 30);
//        existingNo.setBackground(Color.WHITE);
//        existingNo.setFocusPainted(false);
//        add(existingNo);
//
//        ButtonGroup existingGroup = new ButtonGroup();
//        existingGroup.add(existingYes);
//        existingGroup.add(existingNo);
//
//        next = new JButton("Next");
//        next.setFont(new Font("Raleway", Font.BOLD, 20));
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setBounds(620, 660, 80, 30);
//        next.addActionListener(this);
//        add(next);
//
//        setSize(850, 800);
//        setLocation(350, 10);
//        getContentPane().setBackground(Color.WHITE);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        religion = (String) religionComboBox.getSelectedItem();
//        category = (String) categoryComboBox.getSelectedItem();
//        income = (String) incomeComboBox.getSelectedItem();
////        education = (male.isSelected()) ? "Male" : "Female";
//        qualification = (String) qualificationComboBox.getSelectedItem();
//        occupation = (String) occupationComboBox.getSelectedItem();
//        pan = panTextField.getText();
//        aadhar = aadharTextField.getText();
//        seniorCitizen = (seniorYes.isSelected()) ? "Yes" : "No";
//        existingAccount = (existingYes.isSelected()) ? "Yes" : "No";
//
//        try {
//            Conn c = new Conn();
//            String query = "INSERT INTO signuptwo VALUES('" + formno + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + qualification + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "')";
//            c.s.executeUpdate(query);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String args[]) {
//        new Signuptwo("123456");
//    }
//}




package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JRadioButton seniorYes, seniorNo, existingYes, existingNo;
    JButton next;
    String formno;
    JComboBox<String> religionComboBox, categoryComboBox, incomeComboBox, occupationComboBox, qualificationComboBox;

    String religion, category, income, qualification, occupation, pan, aadhar, seniorCitizen, existingAccount;

    Signuptwo(String formno) {
        this.formno = formno; 

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 200, 30);
        add(religionLabel);

        String[] religionOptions = {"Hindu", "Muslim", "Christian", "Other"};
        religionComboBox = new JComboBox<>(religionOptions);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(religionComboBox);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String[] categoryOptions = {"General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox<>(categoryOptions);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(categoryComboBox);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String[] incomeOptions = {"Null", "<150000", "<250000", "500000", "upto 1000000"};
        incomeComboBox = new JComboBox<>(incomeOptions);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(incomeComboBox);

        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(100, 320, 200, 30);
        add(qualificationLabel);

        String[] qualificationOptions = {"Non-Graduate", "Graduate", "Post-Graduation", "Others"};
        qualificationComboBox = new JComboBox<>(qualificationOptions);
        qualificationComboBox.setBounds(300, 320, 400, 30);
        qualificationComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(qualificationComboBox);

        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        String[] occupationOptions = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationComboBox = new JComboBox<>(occupationOptions);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(occupationComboBox);

        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel seniorCitizenLabel = new JLabel("Senior Citizen:");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 540, 200, 30);
        add(seniorCitizenLabel);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300, 540, 100, 30);
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(400, 540, 100, 30);
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);

        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 590, 200, 30);
        add(existingAccountLabel);

        existingYes = new JRadioButton("Yes");
        existingYes.setBounds(300, 590, 100, 30);
        existingYes.setBackground(Color.WHITE);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo.setBounds(400, 590, 100, 30);
        existingNo.setBackground(Color.WHITE);
        add(existingNo);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(existingYes);
        existingGroup.add(existingNo);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 800);
        setLocation(350, 10);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        religion = (String) religionComboBox.getSelectedItem();
        category = (String) categoryComboBox.getSelectedItem();
        income = (String) incomeComboBox.getSelectedItem();
        qualification = (String) qualificationComboBox.getSelectedItem();
        occupation = (String) occupationComboBox.getSelectedItem();
        pan = panTextField.getText();
        aadhar = aadharTextField.getText();
        seniorCitizen = seniorYes.isSelected() ? "Yes" : "No";
        existingAccount = existingYes.isSelected() ? "Yes" : "No";

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (formno, religion, category, income, qualification, occupation, pan, aadhar, seniorCitizen, existingAccount) " +
               "VALUES ('" + formno + "','" + religion + "','" + category + "','" + income + "','" + qualification + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "')";

            c.s.executeUpdate(query);

            setVisible(false);
            new Signupthree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new Signuptwo("123456");
    }
}

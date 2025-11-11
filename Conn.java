package bank.management.system;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BANKMANAGEMENTSYSTEM", "root", "Cseritik@8092");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e);
        }
    }
}



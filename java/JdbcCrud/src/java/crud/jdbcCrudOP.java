/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.lang.classfile.Label;

/**
 *
 * @author harsh
 */
public class jdbcCrudOP extends Frame implements ActionListener {

    TextField searchField = new TextField(20);
    TextArea resultArea = new TextArea(10, 50);
    Choice searchBy = new Choice();
    Button searchButton = new Button("Search");

    jdbcCrudOP() {
        setLayout(new FlowLayout());
        setSize(600, 400);
        setTitle("Telephone Directory");

        searchBy.add("BY TelephoneNo:");
        searchBy.add("BY Name:");
        searchBy.add("BY Address:");

        add(new Label("Search By:"));
        add(searchBy);
        add(new Label("Search:"));
        add(searchField);
        add(searchButton);
        add(resultArea);

        searchButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String search = searchField.getText();
        String searchType = searchBy.getSelectedItem();

        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDB", "postgres", "123");
            Class.forName("org.postgresql.Driver");

            PreparedStatement ps = null;

            if (searchType.equals("BY TelephoneNo:")) {
                ps = conn.prepareStatement("SELECT * FROM \"telDir\" WHERE ? LIKE ANY(telephone)");
                ps.setString(1, search);
            } else if (searchType.equals("BY Name:")) {
                ps = conn.prepareStatement("SELECT * FROM \"telDir\" where first_name LIKE ? OR middle_name LIKE ? OR last_name LIKE ?");
                ps.setString(1, "%" + search + "%");
                ps.setString(2, "%" + search + "%");
                ps.setString(3, "%" + search + "%");
            } else if (searchType.equals("BY Address:")) {
                ps = conn.prepareStatement("SELECT * FROM \"telDir\" where address1 LIKE ? OR address2 LIKE ?  OR area_name LIKE ? OR city LIKE ?");
                ps.setString(1, "%" + search + "%");
                ps.setString(2, "%" + search + "%");
                ps.setString(3, "%" + search + "%");
                ps.setString(4, "%" + search + "%");
            }

            if (ps != null) {
                ResultSet rs = ps.executeQuery();
                resultArea.setText("");

                while (rs.next()) {
                    String result = "Telephone No: " + rs.getString("telephone_no") + "\n" + "Name: " + rs.getString("first_name") + " " + rs.getString("middle_name") + " " + rs.getString("last_name") + "\n" + "Address: " + rs.getString("house_no") + ", " + rs.getString("address1") + ", " + rs.getString("address2") + ", " + rs.getString("area_name") + ", " + rs.getString("city") + "\n\n";
                    resultArea.append(result);
                }
                if(!rs.isBeforeFirst()){
                    resultArea.setText("No Results Found.");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(jdbcCrudOP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jdbcCrudOP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        new jdbcCrudOP();
    }
}

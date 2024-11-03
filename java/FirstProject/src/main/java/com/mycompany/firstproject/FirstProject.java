/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstProject {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.client.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/harshdb","hm10","hm10");
            System.out.println("Connection successfully-------");
            Statement st = con.createStatement();
            ResultSet rs;
            st.executeUpdate("insert into person(id,name) values (6,'ai')");
            rs = st.executeQuery("select * from person");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                    System.out.println(id + "\t\t" +name);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
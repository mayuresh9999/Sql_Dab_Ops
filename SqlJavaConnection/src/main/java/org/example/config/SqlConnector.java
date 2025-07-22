package org.example.config;

import java.sql.*;

public class SqlConnector {


    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String pass = "root123";
        String fetchData = "select * from testdb.staff";
        Connection connection = DriverManager.getConnection(url, username, pass);
        Statement statement = connection.createStatement();
//int a = statement.execute("");
        ResultSet rs = statement.executeQuery("select * from staff where id = 1");
        while
        (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("first_name");
            String lastname = rs.getString("last_name");
            int mobile = rs.getInt("mobile");
            String email = rs.getString("email");
            String city = rs.getString("city");
            System.out.println(id + " : " + firstname + " : " + lastname + " : " + mobile + " : " + email + " : " + city + " : ");

        }
    }

}



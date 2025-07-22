package org.example.config;

import java.sql.*;

public class sqlConnector1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lavanya";
        String username = "root";
        String password = "root123";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        int a = statement.executeUpdate("update employee set salary =50000");
        System.out.println(a);
        ResultSet rs = statement.executeQuery("select * from employee");
        while(rs.next()){
            int id = rs.getInt("employee_id");
            String firstname = rs.getString("first_name");
            String lastname = rs.getString("last_name");
            String email = rs.getString("email");
          //  int phonenumber = rs.getInt("phone_number");
            //int hiredate = rs.getInt("hire_date");
            //String jobtitle = rs.getString("jobtitle");
            String department = rs.getString("department");
            int salary = rs.getInt("salary");
            System.out.println(id + " : " + firstname + " : " + lastname + " : " + email + " : " + department + " : " + salary + " : ");
        }
    };
}

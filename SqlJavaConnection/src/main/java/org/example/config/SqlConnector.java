package org.example.config;

import java.sql.*;

public class SqlConnector {


    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String pass = "root123";
        String fetchData = "select * from testdb.staff";
        Connection connection = DriverManager.getConnection(url, username, pass);
        Statement statement = connection.createStatement();
        //int a = statement.execute("");
        ResultSet rs = statement.executeQuery(fetchData);
        return connection;
    }
}

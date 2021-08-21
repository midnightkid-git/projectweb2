package com.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    public static Connection getConnection(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String nameDTB = "midni770_projectweb";
            String userName = "projectweb";
            String pass = "123";
            cn = DriverManager.getConnection(url + nameDTB, userName, pass);
        }catch (Exception e){
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, e);
        }
        return cn;
    }

    public static void main(String[] args) {
        System.out.println( ConnectionDB.getConnection());
    }
}

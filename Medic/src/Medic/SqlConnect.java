/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medic;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class SqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=MedicApp;user=sa;password=bigmike");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
    }
}

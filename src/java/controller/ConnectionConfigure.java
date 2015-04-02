/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bruno
 */
public class ConnectionConfigure {

    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbox", "root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void main(String[] args){
        Connection connection = null;
        try{
            connection = ConnectionConfigure.getConnection();
            if(connection != null){
                System.out.println("Connection established");
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally{
            if(connection != null){
                try{
                    connection.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

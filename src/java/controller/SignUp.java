/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class SignUp {
    
    private static int idCount = 4;
    
    public static void insert(String name, String email, String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionConfigure.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO user (email, name, password, id) VALUES (?,?,?,?)");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, password);
            preparedStatement.setInt(4, idCount);
            preparedStatement.executeUpdate();
            System.out.println("INSERT INTO user (email, name, password, id) VALUES (?,?,?,?)");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try{
                    connection.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args){
        insert("abc", "abc@cba", "123456");
    }
}

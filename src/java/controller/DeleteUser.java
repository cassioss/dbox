/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Bruno
 */
public class DeleteUser {
    
    public static void delete(String email){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionConfigure.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM user WHERE email = ?");
            preparedStatement.setString(1, email);
            preparedStatement.executeUpdate();
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
        delete("abc@cba");
    }
}

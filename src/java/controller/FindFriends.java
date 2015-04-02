/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class FindFriends {
    
    public static ArrayList<String> friends(String email){
        ArrayList<String> list = new ArrayList<String>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionConfigure.getConnection();
            preparedStatement = connection.prepareStatement("SELECT name FROM user WHERE email "
                    + "IN (SELECT email2 from friendship WHERE email1 = ?)");
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                list.add(resultSet.getString("name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally  {
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
            if (resultSet != null){
                try{
                    resultSet.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    
    public static void main(String[] args){
        ArrayList<String> list = friends("denadai2@illinois.edu");
        for(String str : list){
            System.out.println("name: " + str);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.controller.connection_class;
import com.itn.model.CourseModel;
import com.itn.model.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {
    
    Connection con = null;
    
    public void insert(UserModel objum){
        con=connection_class.makeConnection(); 
        
        String sql="INSERT INTO adduser(username,password)VALUES('"+objum.getUsername()+"','"+objum.getPassword()+"')";
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            System.out.println("done");
             
        } catch (Exception e) {
            System.out.println(sql);
        }
    }
       public static ArrayList<UserModel> select(){
      
        ArrayList<UserModel> al = new ArrayList<UserModel>();
        Connection con=connection_class.makeConnection(); 
        String sql = "SELECT * FROM adduser";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 al.add(new UserModel(rs.getInt("uid"),rs.getString("username"),rs.getString("password")));
        }
        } catch (Exception e) {
            System.out.println(sql);
        }
        return al;
        } 
     public static void delete(int uid){
           Connection con=connection_class.makeConnection(); 
           String sql="DELETE FROM adduser WHERE uid="+uid;
           try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
               System.out.println(sql);
        }
        
    }
}

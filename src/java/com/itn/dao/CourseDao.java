/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.controller.connection_class;
import com.itn.model.CourseModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CourseDao {
     Connection con = null;
    public void insert(CourseModel objcm){
        con=connection_class.makeConnection(); 
        
        String sql="INSERT INTO addcourse(title,price,duration)VALUES('"+objcm.getTitle()+"',"+objcm.getPrice()+",'"+objcm.getDuration()+"')";
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            System.out.println("done");
             
        } catch (Exception e) {
            System.out.println(sql);
        }
    }
    
    public static ArrayList<CourseModel> select(){
      
        ArrayList<CourseModel> al = new ArrayList<CourseModel>();
        Connection con=connection_class.makeConnection(); 
        String sql = "SELECT * FROM addcourse";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 al.add(new CourseModel(rs.getInt("cid"),rs.getString("title"),rs.getInt("price"),rs.getString("duration")));
        }
        } catch (Exception e) {
            System.out.println(sql);
        }
        return al;
        } 
      public static ArrayList<CourseModel> select_by_cid(int cid){
      
        ArrayList<CourseModel> al = new ArrayList<CourseModel>();
        Connection con=connection_class.makeConnection(); 
        String sql = "SELECT * FROM addcourse WHERE cid="+cid;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 al.add(new CourseModel(rs.getInt("cid"),rs.getString("title"),rs.getInt("price"),rs.getString("duration")));
        }
        } catch (Exception e) {
            System.out.println(sql);
        }
        return al;
        }
      
      public  void edit (CourseModel obj){
           Connection con=connection_class.makeConnection(); 
           
           String sql="UPDATE addcourse SET title='"+obj.getTitle()+"',price="+obj.getPrice()+",duration='"+obj.getDuration()+"' WHERE cid="+obj.getCid();
           try {
              Statement st = con.createStatement();
              st.executeUpdate(sql);
          } catch (Exception e) {
               System.out.println(sql);
          }
      }
    
    public static void delete(int cid){
           Connection con=connection_class.makeConnection(); 
           String sql="DELETE FROM addcourse WHERE cid="+cid;
           try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
               System.out.println(sql);
        }
        
    }
        
        
}

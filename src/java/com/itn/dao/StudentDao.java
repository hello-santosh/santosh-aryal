
package com.itn.dao;

import com.itn.controller.connection_class;
import com.itn.model.CourseModel;
import com.itn.model.StudentModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentDao {
    Connection con = null;
      public void insert(StudentModel objcm){
        con=connection_class.makeConnection(); 
        
        String sql="INSERT INTO addstudent(firstname,middlename,lastname,gender,city,address,phone,email,level,area)VALUES('"+objcm.getFirstname()+"','"+objcm.getMiddlename()+"','"+objcm.getLastname()+"','"+objcm.getGender()+"','"+objcm.getCity()+"','"+objcm.getAddress()+"','"+objcm.getPhone()+"','"+objcm.getEmail()+"','"+objcm.getLevel()+"','"+objcm.getArea()+"')";
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            System.out.println("done");
             
        } catch (Exception e) {
            System.out.println(sql);
        }
    }
       public static ArrayList<StudentModel> select(){
      
        ArrayList<StudentModel> al = new ArrayList<StudentModel>();
        Connection con=connection_class.makeConnection(); 
        String sql = "SELECT * FROM addstudent";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 al.add(new StudentModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
        }
             System.out.println("done");
        } catch (Exception e) {
            System.out.println(sql);
        }
        return al;
        } 
       
         public static ArrayList<StudentModel> select_by_sid(int sid){
      
        ArrayList<StudentModel> al = new ArrayList<StudentModel>();
        Connection con=connection_class.makeConnection(); 
        String sql = "SELECT * FROM addstudent WHERE sid="+sid;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 al.add(new StudentModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
        }
             System.out.println("done");
        } catch (Exception e) {
            System.out.println(sql);
        }
        return al;
        } 
         
         
     public static void delete(int sid){
           Connection con=connection_class.makeConnection(); 
           String sql="DELETE FROM addstudent WHERE sid="+sid;
           try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
               System.out.println(sql);
        }
        
    }
        public  void edit (StudentModel obj){
           Connection con=connection_class.makeConnection(); 
           
           String sql="UPDATE addstudent SET firstname='"+obj.getFirstname()+"',middlename='"+obj.getMiddlename()+"',lastname='"+obj.getLastname()+"',gender='"+obj.getGender()+"',city='"+obj.getCity()+"',address='"+obj.getAddress()+"',phone='"+obj.getPhone()+"',email='"+obj.getEmail()+"',level='"+obj.getLevel()+"',area='"+obj.getArea()+"' WHERE sid="+obj.getSid();
           try {
              Statement st = con.createStatement();
              st.executeUpdate(sql);
          } catch (Exception e) {
               System.out.println(sql);
          }
      }
    
}

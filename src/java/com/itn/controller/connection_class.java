
package com.itn.controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection_class {
    public static Connection makeConnection(){
           try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        }catch(Exception a){
            System.out.println("Driver not loaded");
        }
           Connection con = null;
           
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webdatabase","root","");
            System.out.println("Connection passed");
        }
        catch(Exception b){
            System.out.println("Connection failed");
        }


        return con;
    
    }
    public static void main(String[] args) {
        
    }
    
}
    


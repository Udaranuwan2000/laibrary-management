/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;


/**
 *
 * @author hndit2
 */
class database {
    public static Connection connection(){
    
        
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
            return con;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    
}}

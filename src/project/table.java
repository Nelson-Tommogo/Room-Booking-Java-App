/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author TOMMOGO
 */
public class table {
    public static void main(String[]args){
        Connection con = null;
        Statement st = null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(Name varchar(200),Email varchar(200),Password varchar(50),SecurityQuestion varchar(500),Answer varchar(200),Address varchar(200),Status varchar(20))");
            //st.executeUpdate("create table Room(RoomNo varchar(10),RoomType varchar(10),Bed varchar(50),Price int,Status varchar(20))");
            //st.executeUpdate("create table Customer(ID int,Name varchar(100),MobileNumber varchar(50),Nationality varchar(100),Gender varchar(45),Email varchar(100),IDProof varchar(100),Address varchar(100),CheckIn varchar(100),RoomNo varchar(15),Bed varchar(100),RoomType varchar(100),PricePerDay int,NumberofDaysStay int,TotalAmount int,Checkout varchar(100))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        
    }
        catch(HeadlessException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
        finally{
            try
        { 
            con.close();
            st.close();
        }
    
        catch(Exception e)
                {
                    
                }
        }
    
    }
}
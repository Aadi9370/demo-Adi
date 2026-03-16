package com.AdvantageDisadvantage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.entity.StudentMarks;
   
public class insertData {
 public static void main(String[] args) {
	    	

			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password="123456789";
	    	String sql = "insert into StudentMarks values(?,?,?,?,?,?)";
			
			int sum = 0;
			
			//String get="select * from StudentMarks";
			Connection con = null;
			Scanner sc = new Scanner(System.in);
			PreparedStatement pst = null;
			Statement stm =null;
			
			
	      try {
	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	    	  
	    	  con = DriverManager.getConnection(url, user, password);
	    	  
	    	  StudentMarks sm1 = new StudentMarks("John Doe", 45, 65, 78, 90);
	    	  //StudentMarks sm2 = new StudentMarks();
	    	  
	    	 pst = con.prepareStatement(sql);
	    	 pst.setInt(1, sm1.getRoll_no());
	    	 pst.setString(2, sm1.getName());
	    	 pst.setInt(3, sm1.getM1());
	    	 pst.setInt(4, sm1.getM2());
	    	 pst.setInt(5, sm1.getM3());
	    	 pst.setInt(6, sm1.getM4());
	    	 
	    	  
	    	  stm = con.createStatement();
	    	  /*ResultSet rs = stm.executeQuery(sql);
	    	  
	    	  while(rs.next()) {
	    		  
	    		  sm2.setM1(rs.getInt("m1"));
	    		  sm2.setM2(rs.getInt("m2"));
	    		  sm2.setM3(rs.getInt("m3"));
	    		  sm2.setM4(rs.getInt("m4"));
	    	  }
	    	  sum = sm2.getM1()+sm2.getM2()+sm2.getM3()+sm2.getM4();
	    	  double per = (sum*100)/400 ;
	    	  System.out.println(per+"%");*/
	    	  
	    	  
	    	  
	    	 int row = pst.executeUpdate();
	    	 if(row > 0) {
	    		 System.out.println(row + " rows affected");
	    	 }else {
	    		 System.out.println("Insertion Fails");
	    	 }
	    	  
	    	  
	    	  
	      }catch (Exception e) {
	    	  
	    	  try {
				con.close();
				sc.close();
			  } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			  }
	    	  
	    	  
	      }
	    }
	}
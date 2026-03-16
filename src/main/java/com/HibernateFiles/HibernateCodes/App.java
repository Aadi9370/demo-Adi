package com.HibernateFiles.HibernateCodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	String url="jdbc:mysql://localhost:3306/bankdb";
		
		String user = "root";
		String Pass = "123456789";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//Loading... the driver class of MYSQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, user, Pass);
			
			
			String query = "Select * from bank1";
			st = con.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		}catch (Exception e) {
			e.printStackTrace();
			}finally {
				try {
					con.close();
					st.close();
					rs.close();
				} catch (Exception e2) {
					
					
				}
			}
			
		}
		
		
    }


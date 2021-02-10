package demoJDBC.dal;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		String URL="jdbc:sqlserver://localhost;databasename=hotel;";
		String USER="sa";
		String PASSWORD="jupiter";
		String DRIVER="com.microsoft.sqlserver.jdbc.DriverJDBCVersion";
		String SELECT = "SELECT NOM_CLIENT, PRENOM_CLIENT FROM CLIENT";
		
		
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
			
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery(SELECT);
			
			while(rs.next()) {
				String nom = rs.getString("NOM_CLIENT");
				String prenom = rs.getString("PRENOM_CLIENT");
				System.out.println(nom+" "+prenom);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("Connecteur non présent");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		
	}

}

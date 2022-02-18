package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestC {

	public static void main(String[] args) {
		try {

			//Class.forName("com.mysql.jdbc.Driver");
			//Loading class `com.mysql.jdbc.Driver'. This is deprecated. 
			//The new driver class is `com.mysql.cj.jdbc.Driver'. 
			//The driver is automatically registered via the SPI 
			//and manual loading of the driver class is generally unnecessary.

			Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/ezbooks", "pramach",
					"delta007");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			
		//	Statement stmt1 = con.createStatement();
		//	stmt1.execute("insert into book(id, author_id) values(2,12)");
			
			
			con.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

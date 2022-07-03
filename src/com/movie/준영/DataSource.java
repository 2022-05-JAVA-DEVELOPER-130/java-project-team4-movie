package com.movie.준영;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {

	/***********************************************/
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user = "J2205JDEVELOPER#TEAM4";
	private String password = "J2205JDEVELOPER#TEAM4";

	/**********************************************/

	public Connection getConnection() throws Exception {

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		return con;
	}
}

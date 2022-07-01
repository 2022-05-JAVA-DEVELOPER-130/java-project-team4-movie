package com.movie.현정;
/*
 * Connection을 생성하고 , 해지하는 역할을 하는 클래스
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	/***********************************************/
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user = "jdeveloper50";
	private String password = "jdeveloper50";
	/**********************************************/
	
	
	public Connection getConnection() throws Exception{
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		
		return con;
	}
}

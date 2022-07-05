package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.movie.common.DataSource;

public class PaymentSelect {
	DataSource dataSource = new DataSource();
	
	public PaymentSelect() {
		dataSource = new DataSource();
	}
	
	
	public void select() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(null);
	}
	
}

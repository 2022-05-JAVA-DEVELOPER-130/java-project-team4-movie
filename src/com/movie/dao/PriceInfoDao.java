package com.movie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.dto.PriceInfo;


public class PriceInfoDao {
	public void Pricedao(PriceInfo priceinfo) throws Exception{
		String sql="insert into PriceInfo values(?,?,?)";
		Connection conn=DriverManager.getConnection(sql);
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.executeUpdate();
		
		String sql1="select * from PriceInfo values(?,?,?)";
		Connection con=DriverManager.getConnection(sql);
		PreparedStatement pst=con.prepareStatement(sql1);
		ResultSet rs=pstmt.executeQuery(sql1);
		if(rs.next()) {
			int Price_no=rs.getInt(1);
			int Adult_price=rs.getInt(2);
			int Child_price=rs.getInt(3);
			
			rs.close();
			conn.close();
			
		}
}
}

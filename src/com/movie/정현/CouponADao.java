package com.movie.정현;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;
import com.movie.dto.Coupon;

public class CouponADao {
	private DataSource dataSource;
	public CouponADao() throws Exception{
		dataSource = new DataSource();
	}
	
	
public int insertCouponNo(int coupon_no) throws Exception{
		
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(CouponASQL.CouponA_INSERT);
		
		pstmt.setInt(1,coupon_no);
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	
	
}

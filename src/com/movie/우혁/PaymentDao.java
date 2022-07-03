package com.movie.우혁;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PaymentDao {
	private DataSource dataSource;

	public PaymentDao() {
		dataSource = new DataSource();
	}
	
	public int insertPayment(Payment payment) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
		
		pstmt.setInt(1, payment.getPayment_no());
		pstmt.setString(2, payment.getPayment_date());
		pstmt.setInt(3, payment.getAdult_member_count());
		pstmt.setInt(4, payment.getChild_member_count());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public List<Payment> selectAll() throws Exception{
		List<Payment> PaymentList=new ArrayList()<Payment>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			PaymentList.add(new Payment(rs.getInt("payment_no"), rs.getString("payment_date"),
					rs.getInt("coupon_no"), rs.getString("card_name"), rs.getInt("adult_member_count"),
					rs.getInt("child_member_count")));
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return PaymentList;
	}
}

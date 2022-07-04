package com.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.movie.common.DataSource;
import com.movie.dao.PaymentDao;
import com.movie.dao.PaymentSQL;
import com.movie.dao.ReservationDao;
import com.movie.dao.ReservationSQL;
import com.movie.dto.Payment;

public class PaymentReservationService {
	
	DataSource dataSource = new DataSource();
		
		
		
		
		//new Payment(1, "11", 1, "국민", 2,1);
		
		public void AAAA(Payment payment) throws Exception {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
			PreparedStatement pstmt2 = con.prepareStatement(ReservationSQL.Reservation_INSERT);
			pstmt.setInt(1, payment.getCoupon_no());
			pstmt.setString(2, payment.getCard_name());
			pstmt.setInt(3, payment.getAdult_member_count());
			pstmt.setInt(4, payment.getChild_member_count());
			
			
			int rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	
}

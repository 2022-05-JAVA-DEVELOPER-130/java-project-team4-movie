package com.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.movie.common.DataSource;
import com.movie.dao.PaymentSQL;
import com.movie.dao.ReservationSQL;
import com.movie.dao.SeatSQL;
import com.movie.dto.Payment;

public class PaymentService {
	
	DataSource dataSource = new DataSource();
		
		
		
		
		//new Payment(1, "11", 1, "국민", 2,1);
		
		public void PaymentReservation(Payment payment, String id) throws Exception {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
			
			pstmt.setInt(1, payment.getCoupon_no());
			pstmt.setString(2, payment.getCard_name());
			pstmt.setInt(3, payment.getAdult_member_count());
			pstmt.setInt(4, payment.getChild_member_count());
			
			pstmt.executeUpdate();
			PreparedStatement pstmt2 = con.prepareStatement(ReservationSQL.Reservation_INSERT);
			pstmt2.setString(1, id);
			pstmt2.executeUpdate();
			
			pstmt.close();
			pstmt2.close();
			con.close();
			
		}
		
		
		public void SeatPayment(String a, int b) throws Exception{
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_PAYMENT_NO_UPDATE);
			pstmt.setString(1, a);
			pstmt.setInt(2, b);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		}
		
		
		
		
		
		
		
		
	
}

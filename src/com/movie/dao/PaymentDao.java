package com.movie.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Payment;
import com.movie.dto.Seat;


public class PaymentDao {
	private DataSource dataSource;

	public PaymentDao() {
		dataSource = new DataSource();
	}
	/*
	 * 주문전체삭제
	 */
	public int deleteAllReservation(String cus_id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(PaymentSQL.PAYMENT_DELETE_BY_CUSID);
			pstmt.setString(1, cus_id);
			rowCount = pstmt.executeUpdate();
			con.commit();
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	/*
	 * 주문 1건삭제
	 */
	public int deleteByPaymentNo(int payment_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(PaymentSQL.PAYMENT_DELETE_BY_PAYMENTNO);
			pstmt.setInt(1, payment_no);
			rowCount = pstmt.executeUpdate();
			con.commit();
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	/*
	 * 주문생성
	 */
	public int createReservation(Payment payment) throws Exception {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt1 = con.prepareStatement(PaymentSQL.PAYMENT_INSERT);
			pstmt1.setString(1, payment.getCard_name());
			pstmt1.setInt(2, payment.getAdult_member_count());
			pstmt1.setInt(3, payment.getChild_member_count());
			pstmt1.setString(4, payment.getCus_id());
			
			pstmt2 = con.prepareStatement(PaymentSQL.PAYMENT_INSERT_BY_SEATNO);
			for (Seat seat : payment.getSeatList()) {
				pstmt2.setInt(1, seat.getSeat_arrange());
				pstmt2.setInt(2, seat.getSeat_valid());
				pstmt2.setString(3, seat.getHall_name());
				pstmt2.executeQuery();
			}
		} catch (Exception e1) {
			con.rollback();
			e1.printStackTrace();
		} finally {
			if(con!=null)
				con.close();
		}
		
		return 0;
	}
	
	/*
	 * 주문전체(cus_id로 검색)
	 */
	
	
	/*
	 * 주문1개보기
	 */
	
	
}

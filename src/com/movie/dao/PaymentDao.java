package com.movie.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Movie;
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
	public int deleteByCusId(String cus_id) throws Exception {
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
			if (con != null)
				con.close();
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
			if (con != null)
				con.close();
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
			if (con != null)
				con.close();
		}

		return 0;
	}

	/*
	 * 예매내역(cus_id로 검색)
	 */
	public ArrayList<Seat> list(String cus_id) throws Exception {
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(PaymentSQL.SELECT_BY_CUSID_ALL);
			pstmt.setString(1, cus_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				seatList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
						rs.getString("hall_name"), rs.getString("cus_id"), null));
			}
		} finally {
			if (con != null) {
				con.close();
			}
		}

		return seatList;
	}

	public List<Payment> selectAllList() throws Exception {
		List<Payment> paymentList = new ArrayList<Payment>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.PAYMENT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			paymentList.add(new Payment(rs.getInt("payment_no"), rs.getDate("payment_date"), rs.getString("card_name"),
					rs.getInt("adult_member_count"), rs.getInt("child_member_count"), rs.getNString("cus_id"), null));
		}
		rs.close();
		pstmt.close();
		con.close();
		return paymentList;

	}

	public List<Payment> selectAllByCusId(String cus_id) throws Exception {
		List<Payment> paymentList = new ArrayList<Payment>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.SELECT_BY_CUSID);
		pstmt.setString(1, cus_id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			paymentList.add(new Payment(rs.getInt("payment_no"), rs.getDate("payment_date"), rs.getString("card_name"),
					rs.getInt("adult_member_count"), rs.getInt("child_member_count"), rs.getNString("cus_id"), null));
		}
		rs.close();
		pstmt.close();
		con.close();
		return paymentList;

	}

	public Payment showDetails(String cus_id) throws Exception {
		Payment payment = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaymentSQL.SELECT_BY_CUSID_ALL);
		pstmt.setString(1, cus_id);
		ResultSet rs = pstmt.executeQuery();
	
		if (rs.next()) {
			payment = new Payment(rs.getInt("payment_no"), rs.getDate("payment_date"), rs.getString("card_name"),
					rs.getInt("adult_member_count"), rs.getInt("child_member_count"), rs.getString("cus_id"), null);
			do {
				payment.getSeatList().add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"),
						rs.getInt("seat_valid"), rs.getString("hall_name"), rs.getString("cus_id"),
						new Movie(rs.getString("hall_name"), rs.getInt("total_seat_count"), rs.getInt("remain_seat"),
								rs.getString("m_name"), rs.getString("m_genre"), rs.getInt("m_positive_age"),
								rs.getString("m_start_time"), rs.getString("m_end_time"), rs.getString("m_image"),
								rs.getString("m_introduce"), rs.getInt("price_no"))));
			} while (rs.next());
		}

		
		return payment;

	}
	

}

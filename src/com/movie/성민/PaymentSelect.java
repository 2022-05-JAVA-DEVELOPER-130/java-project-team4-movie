package com.movie.성민;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dao.PaymentSQL;
import com.movie.dto.Movie;
import com.movie.dto.Payment;
import com.movie.dto.Seat;

public class PaymentSelect {
	DataSource dataSource = new DataSource();
	
	public PaymentSelect() {
		dataSource = new DataSource();
	}
	String sql = "SELECT p.payment_no, p.payment_date, p.card_name, m.m_name, p.cus_id, m.hall_name, s.seat_no, s.seat_arrange, s.seat_valid, m.m_start_time, m.m_end_time, pi.adult_price, p.adult_member_count, pi.child_price, p.child_member_count, p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = ?";
	
	public int selectByPrice(String id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		int total_price=0;
		if(rs.next()) {
			
			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			
			
			total_price = (adult_price*adult_member_count) + (child_price*child_member_count);
			
			
		}
		return total_price;
	}
	
	
	  public Payment selectByID(String id) throws Exception{
		Payment payment = new Payment();
		Movie movie = new Movie();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Seat> aa = new ArrayList<Seat>(); 
		if(rs.next()) {
			int payment_no = rs.getInt("payment_no");
			Date payment_date = rs.getDate("payment_date");
			String card_name = rs.getString("card_name");
			String cus_id = rs.getString("cus_id");
			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			int totalPrice = (adult_price*adult_member_count) + (child_price*child_member_count);
			
			
			payment = new Payment(payment_no, payment_date, card_name, adult_member_count, child_member_count, cus_id, totalPrice, aa);
			System.out.print("예매번호 : " + payment_no + ", <p>결제일자 : " + payment_date + ", <p>카드 :" + card_name
					+ ", <p>성인 수 : " + adult_member_count + ", <p>청소년 수 :" + child_member_count
			+ ", <p>ID : " + cus_id + "<p>좌석 : ");
			do {
				payment.getSeatList().add(new Seat(rs.getInt("seat_no"),
													rs.getInt("seat_arrange"),
													rs.getInt("seat_valid"),
																		new Movie(rs.getString("hall_name"),
																					rs.getString("m_name"),
																					rs.getString("m_start_time"),
																					rs.getString("m_end_time")
																					)));
				movie = new Movie(rs.getString("hall_name"),
						rs.getString("m_name"),
						rs.getString("m_start_time"),
						rs.getString("m_end_time"));
				System.out.print(rs.getInt("seat_no") + "번 ");
				
			}while(rs.next());
		
			System.out.println("<p>회차 : " + movie.getHallName() + "<p>영화이름 : " + movie.getM_Name() + "<p>시작시간" + movie.getM_Start_Time() + "<p>종료시간 : " + movie.getM_End_Time());
			
			
		}
		return payment;
	}
	 
	
	/*
	//예매내역출력
	public ArrayList<Seat> selectByID(String cus_id) throws Exception {
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(null);
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
	*/
	
	
}

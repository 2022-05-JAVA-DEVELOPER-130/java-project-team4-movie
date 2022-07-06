package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.movie.common.DataSource;
import com.movie.dao.PaymentSQL;
import com.movie.dto.Seat;

public class PaymentSelect {
	DataSource dataSource = new DataSource();
	
	public PaymentSelect() {
		dataSource = new DataSource();
	}
	String sql = "SELECT m.m_name, p.cus_id, m.hall_name, s.seat_no, m.m_start_time, m.m_end_time, pi.adult_price, p.adult_member_count, pi.child_price, p.child_member_count, p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = ?";
	
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
	
	/*
	 * public void selectByPrice() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString("m_name");
			String id = rs.getString("cus_id");
			String hall_name = rs.getString("hall_name");
			int seat_no = rs.getInt("seat_no");
			String m_start_time = rs.getString("m_start_time");
			String m_end_time = rs.getString("m_end_time");
			int adult_price = rs.getInt("adult_price");
			int child_price = rs.getInt("child_price");
			int adult_member_count = rs.getInt("adult_member_count");
			int child_member_count = rs.getInt("child_member_count");
			
			String card_name = rs.getString("card_name");
			String date = rs.getString("sysdate");
			
			System.out.println((adult_price*adult_member_count) + (child_price*child_member_count));
			
			System.out.println(name);
			System.out.println(id);
			System.out.println(hall_name);
			System.out.println(seat_no);
			System.out.println(m_start_time);
			System.out.println(m_end_time);
			System.out.println(card_name);
			System.out.println(date);
			System.out.println("11");
			
		}
	}
	 */
	
	
	
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
	
	
	
}

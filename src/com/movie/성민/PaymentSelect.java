package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.common.DataSource;

public class PaymentSelect {
	DataSource dataSource = new DataSource();
	
	public PaymentSelect() {
		dataSource = new DataSource();
	}
	String sql = "SELECT m.m_name, p.cus_id, m.hall_name, s.seat_no, m.m_start_time, m.m_end_time, (pi.adult_price*p.adult_member_count) + (pi.child_price*p.child_member_count), p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = 'seongmin'";
	
	public void select() throws Exception{
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
			int totalPrice = rs.getInt("(pi.adult_price*p.adult_member_count) + (pi.child_price*p.child_member_count)");
			String card_name = rs.getString("card_name");
			String date = rs.getString("sysdate");
			
			System.out.println(name);
			System.out.println(id);
			System.out.println(hall_name);
			System.out.println(seat_no);
			System.out.println(m_start_time);
			System.out.println(m_end_time);
			System.out.println(totalPrice);
			System.out.println(card_name);
			System.out.println(date);
			System.out.println("11");
			
			
		}
	}
	
}

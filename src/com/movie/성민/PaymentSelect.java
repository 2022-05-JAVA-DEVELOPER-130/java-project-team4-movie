package com.movie.성민;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.movie.common.DataSource;

public class PaymentSelect {
	DataSource dataSource = new DataSource();
	
	public PaymentSelect() {
		dataSource = new DataSource();
	}
	String sql = "SELECT m.m_name, p.cus_id, m.hall_name, s.seat_no, m.m_start_time, m.m_end_time, (pi.adult_price*p.adult_member_count) + (pi.child_price*p.child_member_count), p.card_name, sysdate FROM payment p join seat s on p.seat_no = s.seat_no join movie_hall m on s.hall_name = m.hall_name join price_info pi on m.price_no = pi.price_no where p.cus_id = 'seongmin';";
	
	public void select() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(null);
	}
	
}

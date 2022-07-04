package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Reservation;

public class ReservationDao {
	private DataSource dataSource;
	public ReservationDao() throws Exception{
		dataSource= new DataSource();
	}
/*
  * 예매번호 부여?
 */
	
public int insertReservationNo(Reservation Reservation) throws Exception{
		
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(ReservationSQL.Reservation_INSERT);
		pstmt.setInt(1, Reservation.getreservation_no());
		pstmt.setString(2, Reservation.getCus_id());
		pstmt.setInt(3, Reservation.getPayment_no());
		
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return 0;
	}
	
		

	/*
	 * 예매 내역 확인
	 */
	
public List<Reservation> selectAll() throws Exception{
		
		List<Reservation> ReservationList=new ArrayList<Reservation>();
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			ReservationList.add(new Reservation(rs.getInt("reservation_no"), 
					rs.getString("cus_id"),rs.getInt("payment_no")
					)
					);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		
		return ReservationList;
		
	}
/*
 * 예매내역 취소?
 */
public int deleteReservation(int reservation_no) throws Exception {
	
	Connection con=dataSource.getConnection();
	PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_DELETE);
	pstmt.setInt(1, reservation_no);
	int rowCount=pstmt.executeUpdate();
	pstmt.close();
	con.close();
	return 0;
	
}
	
}
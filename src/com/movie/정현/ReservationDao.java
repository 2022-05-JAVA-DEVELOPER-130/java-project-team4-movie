package com.movie.정현;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		pstmt.setInt(1, Reservation.getCus_reservation_no());
		pstmt.setInt(2, Reservation.getAdult_count());
		pstmt.setInt(3, Reservation.getChild_count());
		
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
			ReservationList.add(new Reservation(rs.getInt("cus_reservation_no"), 
					rs.getInt("adult_count"),rs.getInt("child_count")
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
public int deleteReservation(int cus_reservation_no) throws Exception {
	
	Connection con=dataSource.getConnection();
	PreparedStatement pstmt=con.prepareStatement(ReservationSQL.Reservation_DELETE);
	pstmt.setInt(1, cus_reservation_no);
	int rowCount=pstmt.executeUpdate();
	pstmt.close();
	con.close();
	return 0;
	
}
	
}
package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dto.Seat;

public class SeatDao {
	private DataSource dataSource;

	public SeatDao() {
		dataSource = new DataSource();
	}


	/*
	 * 좌석예매
	 */
	public int update(int seat_valid, int seat_no, String hall_name) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_UPDATE);
		pstmt.setInt(1, seat_valid);
		pstmt.setInt(2, seat_no);
		pstmt.setString(3, hall_name);

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

	/*
	 * 남은좌석 유무확인
	 */
//	public List<Seat> selectByRemain(String hall_name, int seat_valid) throws Exception {
//		ArrayList<Seat> remainList = new ArrayList<Seat>();
//		Connection con = dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_BY_REMAIN);
//		pstmt.setString(1, hall_name);
//		pstmt.setInt(2, seat_valid);
//		ResultSet rs = pstmt.executeQuery();
//		while (rs.next()) {
//			remainList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
//					rs.getString("hall_name"), rs.getInt("payment_no")));
//		}
//		rs.close();
//		pstmt.close();
//		con.close();
//
//		return remainList;
//
//	}

	
	/*
	 * 자리번호로 예매가능여부확인
	 */
	public Seat selectByNo(int seat_arrange) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_BY_NO);
		pstmt.setInt(1, seat_arrange);
		ResultSet rs=pstmt.executeQuery();
		Seat findSeat=null;
		if(rs.next()) {
			
						
		}
		return findSeat;
		

	}
	
	
	
	/*
	 * 회차당 전체좌석확인
	 */
	public List<Seat> selectAll(String hall_name) throws Exception {
		ArrayList<Seat> allList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_ALL);
		pstmt.setString(1, hall_name);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			allList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
					rs.getString("hall_name"), rs.getInt("payment_no")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return allList;

	}
}

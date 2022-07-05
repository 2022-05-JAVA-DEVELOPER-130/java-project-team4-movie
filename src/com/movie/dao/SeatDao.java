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
	 * 좌석예매(예매 시 seat_valid가 0으로 바뀜)
	 */
	public int update(String cus_id, String hall_name, int seat_arrange) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_UPDATE);
		pstmt.setString(1, cus_id);
		pstmt.setString(2, hall_name );
		pstmt.setInt(3, seat_arrange);

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

	/*
	 * 아이디로 예매좌석 호출
	 */
	public List<Seat> selectById(String cus_id) throws Exception {
		ArrayList<Seat> findList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_BY_ID);
		pstmt.setString(1, cus_id );
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			findList.add(new Seat(rs.getInt("seat_no"), 
							  rs.getInt("seat_arrange"),
							  rs.getInt("seat_valid"),
							  rs.getString("hall_name"),
							  rs.getString("cus_id")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findList;

	
	}
	
	
	/*
	 * 회차별 남은좌석 유무확인(seat_valid가 1인값만 출력)
	 */
	public List<Seat> selectByHall(String hall_name) throws Exception {
		ArrayList<Seat> remainList = new ArrayList<Seat>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_BY_HALL);
		pstmt.setString(1, hall_name);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			if(rs.getInt("seat_valid")==1) {
				remainList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
						rs.getString("hall_name"), rs.getString("cus_id")));
			}
			
		}
		rs.close();
		pstmt.close();
		con.close();

		return remainList;

	}

	

	
	
//	/*
//	 * 회차당 전체좌석확인
//	 */
//	public List<Seat> selectAll(String hall_name) throws Exception {
//		ArrayList<Seat> allList = new ArrayList<Seat>();
//		Connection con = dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(SeatSQL.SEAT_SELECT_ALL);
//		pstmt.setString(1, hall_name);
//		ResultSet rs = pstmt.executeQuery();
//		while (rs.next()) {
//			allList.add(new Seat(rs.getInt("seat_no"), rs.getInt("seat_arrange"), rs.getInt("seat_valid"),
//					rs.getString("hall_name"), rs.getString("cus_id")));
//		}
//		rs.close();
//		pstmt.close();
//		con.close();
//		return allList;

	}


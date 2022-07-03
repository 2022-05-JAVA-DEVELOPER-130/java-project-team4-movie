package com.movie.준영;

public class MovieTestMain {

	public static void main(String[] args) throws Exception {

		MovieDao movie = new MovieDao();
		System.out.println("1. hall_name select");
		System.out.println(">> "+movie.selectByHallName("1회차"));
	
	}

}

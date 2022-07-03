package com.movie.정현;

public class Reservation {
	private int cus_reservation_no;
	private int adult_count;
	private int child_count;
	public Reservation(int cus_reservation_no, int adult_count, int child_count) {
		super();
		this.cus_reservation_no = cus_reservation_no;
		this.adult_count = adult_count;
		this.child_count = child_count;
	}
	public int getCus_reservation_no() {
		return cus_reservation_no;
	}
	public void setCus_reservation_no(int cus_reservation_no) {
		this.cus_reservation_no = cus_reservation_no;
	}
	public int getAdult_count() {
		return adult_count;
	}
	public void setAdult_count(int adult_count) {
		this.adult_count = adult_count;
	}
	public int getChild_count() {
		return child_count;
	}
	public void setChild_count(int child_count) {
		this.child_count = child_count;
	}
	@Override
	public String toString() {
		return "Reservation [cus_reservation_no=" + cus_reservation_no + ", adult_count=" + adult_count
				+ ", child_count=" + child_count + "]";
	}
	
	
}
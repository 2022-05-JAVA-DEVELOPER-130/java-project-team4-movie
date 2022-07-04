package com.movie.dto;

public class Reservation {
	private int reservation_no;
	private String cus_id;
	private int payment_no;
	
	public Reservation(int reservation_no, String cus_id, int payment_no) {
		super();
		this.reservation_no = reservation_no;
		this.cus_id=cus_id;
		this.payment_no=payment_no;
		
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public int getreservation_no() {
		return reservation_no;
	}
	public void setreservation_no(int cus_reservation_no) {
		this.reservation_no = reservation_no;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [reservation_no=" + reservation_no + ", cus_id=" + cus_id + ", payment_no=" + payment_no + "]";
	}
	
		
}
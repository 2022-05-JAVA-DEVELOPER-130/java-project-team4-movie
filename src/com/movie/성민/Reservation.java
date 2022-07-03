package com.movie.성민;

import com.movie.dto.Cus;

public class Reservation {
	private int reservation_no;
	private Payment payment; 
	private Cus cus;
	
	public Reservation(int reservation_no, Payment payment, Cus cus) {
		super();
		this.reservation_no = reservation_no;
		this.payment = payment;
		this.cus = cus;
	}
	public int getReservation_no() {
		return reservation_no;
	}
	public void setReservation_no(int reservation_no) {
		this.reservation_no = reservation_no;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Cus getCus() {
		return cus;
	}
	public void setCus(Cus cus) {
		this.cus = cus;
	}
	@Override
	public String toString() {
		return "Reservation [reservation_no=" + reservation_no + ", payment=" + payment + ", cus=" + cus + "]";
	}
	
	
	
}

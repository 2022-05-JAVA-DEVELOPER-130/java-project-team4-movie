package com.movie.성민;

public class Payment {
	private int payment_no;
	private String payment_date;
	private int coupon_no;
	private String card_name;
	private int adult_member_count;
	private int child_member_count;
	public Payment(int payment_no, String payment_date, int coupon_no, String card_name, int adult_member_count,
			int child_member_count) {
		super();
		this.payment_no = payment_no;
		this.payment_date = payment_date;
		this.coupon_no = coupon_no;
		this.card_name = card_name;
		this.adult_member_count = adult_member_count;
		this.child_member_count = child_member_count;
	}
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public int getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(int coupon_no) {
		this.coupon_no = coupon_no;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public int getAdult_member_count() {
		return adult_member_count;
	}
	public void setAdult_member_count(int adult_member_count) {
		this.adult_member_count = adult_member_count;
	}
	public int getChild_member_count() {
		return child_member_count;
	}
	public void setChild_member_count(int child_member_count) {
		this.child_member_count = child_member_count;
	}
	@Override
	public String toString() {
		return "Payment [payment_no=" + payment_no + ", payment_date=" + payment_date + ", coupon_no=" + coupon_no
				+ ", card_name=" + card_name + ", adult_member_count=" + adult_member_count + ", child_member_count="
				+ child_member_count + "]";
	}
	
	
	
}

package com.movie.dao;

public class PaymentSQL {
	
	public final static String PAYMENT_INSERT
	="insert into payment values(payment_no,?,?,?)";
	public final static String PAYMENT_SELECT_ALL
	="select * from payment";
}

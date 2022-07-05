package com.movie.dao;

public class PaymentSQL {
	
	public final static String PAYMENT_INSERT
	="insert into payment values(payment_no_seq.nextval,SYSDATE,?,?,?,?)";
	public final static String PAYMENT_SELECT_ALL
	="select * from payment";
	public final static String PAYMENT_SELECT_BY_NO
	="select * from payment where payment_no=?";
	public final static String PAYMENT_DELETE
	="delete from payment where payment_no=?";
}

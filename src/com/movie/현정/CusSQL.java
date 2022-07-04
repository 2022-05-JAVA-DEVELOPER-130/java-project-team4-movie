package com.movie.현정;

public class CusSQL {
	public static final String CUS_INSERT
	= "insert into cus values(cus_cus_no_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
	public static final String CUS_UPDATE
	= "update cus set cus_no=?,cus_nickname=?,cus_name=?,cus_password=?,cus_birthday=?,cus_gender=?,cus_phone=?,cus_email=?,cus_point=?,coupon_no=? where cus_id=? and cus_password=?";
	public static final String CUS_UPDATE2 //회원정보수정용
	= "update cus set cus_nickname=?,cus_password=?,cus_birthday=?,cus_gender=?,cus_phone=?,cus_email=? where cus_id=? and cus_password=?";
	public static final String CUS_DELETE
	= "delete from cus where cus_id=?";
	public static final String CUS_SELECT_BY_ID
	= "select * from cus where cus_id = ?";
	public static final String CUS_SELECT_ALL
	= "select * from cus";
	public static final String CUS_SELECT_BY_NAME_PHONE
	= "select * from cus where cus_name=? and cus_phone=?";
	public static final String CUS_SELECT_BY_ID_NAME
	= "select * from cus where cus_id=? and cus_name=?";


}

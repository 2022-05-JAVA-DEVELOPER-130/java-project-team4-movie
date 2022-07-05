package com.movie.service;

import java.util.List;

import com.movie.dao.CusJoinDao;
import com.movie.dto.Customer;

public class CusService {
	private CusJoinDao cusJoinDao;
	public CusService() {
		cusJoinDao = new CusJoinDao();
	}
	
	//회원가입
	
	public boolean addCustomer(Customer newCustomer) throws Exception{
		boolean isSuccess = false;
		
		if(cusJoinDao.selectById(newCustomer.getCus_id()) == null) {
			int rowCount = cusJoinDao.insertCus(newCustomer);
			isSuccess = true;
			
		}else {
			isSuccess = false;
		}
		
		
			return isSuccess;
	}
	
	//로그인
	
	public int login(String cus_id, String cus_password) throws Exception{
		int loginResult = 10;
		Customer findCustomer = cusJoinDao.selectById(cus_id);
		if(findCustomer == null) {
			loginResult = 1;
			//아이디 일치하지 않음
		}else {
			if (findCustomer.getCus_password().equals(cus_password)) {
				loginResult = 0;
				//로그인성공
			}else {
				loginResult = 2;
				//패스워드불일치
			}
		}
		return loginResult;
		
	}

	
	//회원탈퇴
	public int deleteInfo(String cus_id) throws Exception{
		return 0;
	}

	//고객 전체검색
	public List<Customer> findAll() throws Exception{
		return cusJoinDao.selectAll();
	}


	/*
	//이름, 연락처 입력후 아이디 찾기
		public Customer findId(String cus_name, String cus_phone) throws Exception{						
			return cusJoinDao.selectByNamePhone();
	}

	//정보수정
	public boolean updateInfo(String cus_nickname, String cus_password, String cus_birthday, String cus_gender, String cus_phone, String cus_email ) {
		boolean isUpdate = false;
		
		Customer updateCustomer = cusJoinDao.updateCus2(cus_password);
		
		
		if(cusJoinDao.updateCus2(null))
		
		
		
		
		return true;
	}

	
	//아이디, 이름 입력후 비밀번호 찾기
	public Customer findPassword(String cus_id, String cus_name)throws Exception{
		return cusJoinDao.selectByIdName();
	}
		
*/
}

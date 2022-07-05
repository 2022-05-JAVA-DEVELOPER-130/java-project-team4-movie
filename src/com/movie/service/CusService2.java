package com.movie.service;
import java.util.List;

import com.movie.dao.CusJoinDao;
import com.movie.dto.Customer;

public class CusService2 {
	private CusJoinDao cusJoinDao;
	public CusService2() {
		cusJoinDao = new CusJoinDao();
	}
	
	//고객 전체검색
		public List<Customer> findAll() throws Exception{
			return cusJoinDao.selectAll();
		}


		
		//이름, 연락처 입력후 아이디 찾기
		public String findId(String cus_name, String cus_phone) throws Exception{	
				return cusJoinDao.selectByNamePhone(cus_name,cus_phone);
		}
			
		

				
		//아이디, 이름 입력후 비밀번호 찾기
		public String findPassword(String cus_id, String cus_name)throws Exception{
			return cusJoinDao.selectByIdName(cus_id,cus_name);
		}
			
	

}

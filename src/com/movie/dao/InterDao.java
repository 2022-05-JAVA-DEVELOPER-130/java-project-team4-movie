package com.movie.dao;

import java.util.List;

public interface InterDao {
	public int insert(Object object);
	public int update(Object object);
	public int delelteByNo(int no);
	public Object selectByNo(int no);
	public List<Object> selectAll();
}
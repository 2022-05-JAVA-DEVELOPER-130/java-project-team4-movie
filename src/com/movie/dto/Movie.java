package com.movie.dto;

public class Movie {
	private int m_no;
	private String m_name;
	private String m_genre;
	private int positive_age;
	public Movie(int m_no, String m_name, String m_genre, int positive_age) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_genre = m_genre;
		this.positive_age = positive_age;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_genre() {
		return m_genre;
	}
	public void setM_genre(String m_genre) {
		this.m_genre = m_genre;
	}
	public int getPositive_age() {
		return positive_age;
	}
	public void setPositive_age(int positive_age) {
		this.positive_age = positive_age;
	}
	@Override
	public String toString() {
		return "Movie [m_no=" + m_no + ", m_name=" + m_name + ", m_genre=" + m_genre + ", positive_age=" + positive_age
				+ "]";
	}
	
	
	
}
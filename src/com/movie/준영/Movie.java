package com.movie.준영;

public class Movie {

	private String hallName;
	private int totalSeatCount;
	private int remainSeat;
	private int m_No;
	private String m_Name;
	private String m_Genre;
	private int m_Positive_Age;
	private String m_Start_Time;
	private String m_End_Time;
	private String m_Image;
	private String m_Introduce;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String hallName, int totalSeatCount, int remainSeat, int m_No, String m_Name, String m_Genre,
			int m_Positive_Age, String m_Start_Time, String m_End_Time, String m_Image, String m_Introduce) {
		super();
		this.hallName = hallName;
		this.totalSeatCount = totalSeatCount;
		this.remainSeat = remainSeat;
		this.m_No = m_No;
		this.m_Name = m_Name;
		this.m_Genre = m_Genre;
		this.m_Positive_Age = m_Positive_Age;
		this.m_Start_Time = m_Start_Time;
		this.m_End_Time = m_End_Time;
		this.m_Image = m_Image;
		this.m_Introduce = m_Introduce;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getTotalSeatCount() {
		return totalSeatCount;
	}

	public void setTotalSeatCount(int totalSeatCount) {
		this.totalSeatCount = totalSeatCount;
	}

	public int getRemainSeat() {
		return remainSeat;
	}

	public void setRemainSeat(int remainSeat) {
		this.remainSeat = remainSeat;
	}

	public int getM_No() {
		return m_No;
	}

	public void setM_No(int m_No) {
		this.m_No = m_No;
	}

	public String getM_Name() {
		return m_Name;
	}

	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}

	public String getM_Genre() {
		return m_Genre;
	}

	public void setM_Genre(String m_Genre) {
		this.m_Genre = m_Genre;
	}

	public int getM_Positive_Age() {
		return m_Positive_Age;
	}

	public void setM_Positive_Age(int m_Positive_Age) {
		this.m_Positive_Age = m_Positive_Age;
	}

	public String getM_Start_Time() {
		return m_Start_Time;
	}

	public void setM_Start_Time(String m_Start_Time) {
		this.m_Start_Time = m_Start_Time;
	}

	public String getM_End_Time() {
		return m_End_Time;
	}

	public void setM_End_Time(String m_End_Time) {
		this.m_End_Time = m_End_Time;
	}

	public String getM_Image() {
		return m_Image;
	}

	public void setM_Image(String m_Image) {
		this.m_Image = m_Image;
	}

	public String getM_Introduce() {
		return m_Introduce;
	}

	public void setM_Introduce(String m_Introduce) {
		this.m_Introduce = m_Introduce;
	}

	@Override
	public String toString() {
		return "Movie [hallName=" + hallName + ", totalSeatCount=" + totalSeatCount + ", remainSeat=" + remainSeat
				+ ", m_No=" + m_No + ", m_Name=" + m_Name + ", m_Genre=" + m_Genre + ", m_Positive_Age="
				+ m_Positive_Age + ", m_Start_Time=" + m_Start_Time + ", m_End_Time=" + m_End_Time + ", m_Image="
				+ m_Image + ", m_Introduce=" + m_Introduce + "]";
	}
	
	
}

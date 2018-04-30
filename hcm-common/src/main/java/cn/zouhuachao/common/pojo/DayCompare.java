package cn.zouhuachao.common.pojo;

public class DayCompare {
	    private int year;
	    public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		private int month;
	    private int day;
		public DayCompare() {
			super();
			// TODO Auto-generated constructor stub
		}
		public DayCompare(int year, int month, int day) {
			super();
			this.year = year;
			this.month = month;
			this.day = day;
		}
}

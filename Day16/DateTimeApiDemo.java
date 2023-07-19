package Day16;

public class DateTimeApiDemo {
	public static void main(String[] args) {
		
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		
		long hour = utilDate.getHours();
		System.out.println(hour);
		long time = utilDate.getTime();
		System.out.println(time);
		
		java.sql.Date sqlDate = new java.sql.Date(hour);
		System.out.println(sqlDate);
		
		java.sql.Date sqlDate2 = new java.sql.Date(time);
		System.out.println(sqlDate2);
	}
}
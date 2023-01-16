 import java.util.*;
 class YearWeekDay
 {
	 public static void main(String args[])
	 {
		 int m,year,week,day;
		 Scanner S = new Scanner(System.in);
		 System.out.println("Enter the no of days");
		 m=S.nextInt();
		 year=m/365;
		 System.out.println("No of years= "+year);
		 week=m/7;
		 m=m%7;
		 System.out.println("No of weeks= "+week);
		 day=m;
		 System.out.println("No of days= "+day);
	 }
 }
		 
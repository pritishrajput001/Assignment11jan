 import java.util.Scanner;
 class FindThirdAngle
 {
	 public static void main(String args[])
	 {
		 float firstang,secondang,thirdang;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first angle of triangle");
		 firstang = sc.nextFloat();
		 System.out.println("Enter second angle of triangle");
		 secondang = sc.nextFloat();
		 
		 thirdang = 180 - (firstang + secondang);
		 System.out.println("Third angle of triangle is "+ thirdang);
	 }
 }
		 
	 
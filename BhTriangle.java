 import java.util.Scanner;
 class BhTriangle
 {
	 public static void main(String args[])
	 {
		 float base, height,area;
		 Scanner sc =  new Scanner(System.in);
		 System.out.println("First enter base and then enter height of triangle");
		 base = sc.nextFloat();
		 height = sc.nextFloat();
		 area = (base*height)/2;
		 System.out.println("Area of triangle = "+area);
	 }
 }
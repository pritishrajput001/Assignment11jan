 import java.util.Scanner;
 class PerimeterAreaRect
 {
	 public static void main(String args[])
	 {
		 float length,breadth,area,perimeter;
		 Scanner sc =  new Scanner(System.in);
		 System.out.println("Enter length of rectangle");
		 length = sc.nextFloat();
		 System.out.println("Enter breadth of rectangle");
		 breadth = sc.nextFloat();
		 perimeter=2*(length+breadth);
		 area=length*breadth;
		 System.out.println("Area of rectangle is "+area +"and Perimeter of rectangle is" + perimeter);
	 }
 }
		   
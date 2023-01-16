 import java.util.*;
 class DegCel
 {
	 public static void main(String args[])
	 {
		 double degs,farh;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter temperature in degree celsius");
		 degs=s.nextDouble();
		 farh=(degs*1.8)+32;
		 System.out.println("Temperature in Fahrenheit is"+ farh);
	 }
 }
		 
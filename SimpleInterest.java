 import java.util.Scanner;
 class SimpleInterest
 {
	 public static void main(String args[])
	 {
		 float principal,time,rate,si;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value of P,T and R");
		 principal = s.nextFloat();
		 time = s.nextFloat();
		 rate = s.nextFloat();
		 
		 si=(principal*time*rate)/100;
		 System.out.println("Simple Interest= "+si);
	 }
 }
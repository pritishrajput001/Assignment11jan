 import java.util.Scanner;
 class CompoundInterest
 {
	 public static void main(String args[])
	 {
		 double principal,time,rate,ci;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value of Principal,Time and Rate");
		 principal = s.nextDouble();
		 time = s.nextDouble();
		 rate = s.nextDouble();
		 
		 ci = principal *(Math.pow((1+rate/100),time));
		 System.out.println("Compound Interest= "+ci);
	 }
 }
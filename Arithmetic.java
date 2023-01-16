 import java.util.Scanner;
 class Arithmetic
 {
	 public static void main(String args[])
	 {
		 int num1,num2,sum,sub,mul,div;
		 Scanner sc =  new Scanner(System.in);
		 System.out.println("Enter two numbers");
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 sum=num1+num2;
		 sub=num1-num2;
		 mul=num1*num2;
		 div=num1/num2;
		 System.out.println("Addition= "+sum);
		 System.out.println("Subtraction= "+sub);
		 System.out.println("Multiplication= "+mul);
		 System.out.println("Division= "+div);
	 }
 }
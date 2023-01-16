 import java.util.Scanner;
 class NumPower
 {
  public static void main(String[] args) 
  {

    int base,power;
    double result;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	base = s.nextInt();
	System.out.println("Enter power");
	power = s.nextInt();
	result= Math.pow(base, power);

    System.out.println("Answer = " + result);
  }
}
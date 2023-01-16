 import java.util.Scanner;
 class AreaOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
          double side,area;
		  Scanner sc= new Scanner(System.in);
          System.out.println("Enter the side of the Triangle");
          side = sc.nextDouble();
          area=(Math.sqrt(3)/4)*(side*side);
          System.out.println("Area of Triangle is: " + area);      
     }
}
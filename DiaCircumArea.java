import java.util.*;
class DiaCircumArea
{
    public static void main(String args[])
    {
        double radius,diameter,circumference,area;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter radius of circle");
        radius=sc.nextDouble();
		
        diameter=2*radius;
        circumference=2*3.14*radius;
        area=3.14*(radius*radius);
		
        System.out.println("Diameter of circle= "+diameter);
        System.out.println("Circumference of circle= "+circumference);
        System.out.println("Area of circle= "+area);
    }
}
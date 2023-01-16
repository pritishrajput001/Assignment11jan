
 import java.util.*;
class MmKm
{
    public static void main(String args[])
    {
        float centimeter,meter,kilometer;
        Scanner S =new Scanner(System.in);
        System.out.println("Enter length in centimeter");
        
        centimeter = S.nextFloat();
        meter=centimeter/100;
        kilometer=centimeter/100000;
        
        System.out.println("Length in Meter"+meter);
        System.out.println("Lenth in Kilometer= "+kilometer);
        
    }
}
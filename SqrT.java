
    import java.util.Scanner;
    class SqrT 
	{
    public static void main(String[] args) 
	{
    	double num,result;
		Scanner in = new Scanner(System.in);

        System.out.println("Enter number ");
		num = in.nextDouble();
        result = Math.sqrt(num);

        System.out.println("Squareroot of num is"+ result );
    }
}
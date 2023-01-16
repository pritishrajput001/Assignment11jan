import java.util.Scanner;
class MarksTot
{
	public static void main(String args[])
	{
		float c,cpp,java,python,dotnet;
		double total,avg,percent;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		System.out.println("Enter marks of C");
		c=s.nextFloat();
		System.out.println("Enter marks of CPP");
		cpp=s.nextFloat();
		System.out.println("Enter marks of Python");
		python=s.nextFloat();
		System.out.println("Enter marks of Java");
		java=s.nextFloat();
		System.out.println("Enter marks of DotNet");
		dotnet=s.nextFloat();
		
		total = c+cpp+python+java+dotnet;
		avg = (total/5.0);
		percent = (total/500.0)*100;
		
		System.out.println("Total Marks= "+total);
		System.out.println("Average Marks= "+avg);
		System.out.println("Percentage= "+percent);
	}
}
		
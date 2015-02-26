import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AssignmentFour{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(args[0]));
		double input = 0;
		int i = 0;
		double min = 0;
		double max = 0;
		boolean first = true;
		System.out.println("Pongsathorn Cherngchaosil.  CECS 174, Assignment Four");
		while(sc.hasNextDouble())
		{
			double d = sc.nextDouble();
			if(first)
			{
				max = d;
				min = d;
				first = false;
			}
			else
			{
				if(d>max)
				{max = d;}
				if(d<min)
				{min = d;}
			}
			
			
			function1(d);
			function2(d);
			function3(d);
			 System.out.println("Sqrt of " + d + " by Math.sqrt is " + Math.sqrt(d)+"\n------------------------------------------------------");
			 input += d;
			 i++;
		}
		function4(input,i);
		System.out.println("Minimum is: "+min+"\nMaximum is: "+max);
	}
	private static void function1(double f)
	{
		System.out.println(f+" degrees Farenheit = "+((f-32)*(5.0/9.0))+" degrees Celsius" );
	}
	
	private static void function2(double c)
	{
		System.out.println(c + " degrees Celsius = "+ (c*(9.0/5.0)+32)+" degrees Farenheit" );
	}
	
	private static void function3(double s)
	{
		double x;
		int count = 0;
		System.out.print("Sqrt of " + s);
		if (s<0)
		{System.out.print(" is not a real number\n");}
		else
		{
			x = s/2.0;
			while((x*x)-s >= 0.00001)
			{
				x = x-(((x*x)-s)/(2*x));
				count++;
			}System.out.println(" by Newton/Raphson is "+ x+" after "+count+" iterations");
		}
	}
	
	private static void function4(double in, int c)
	{System.out.println("Sum is " + in+", count is"+c+" average is "+(in/c));}

}

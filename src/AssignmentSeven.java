import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentSeven 
{
	public static void main(String[] args) throws FileNotFoundException
	{	
		int[] numbers = readInput(args[0]);
		System.out.println("Statistics for Quiz Five\n");
		doOutput("Sum", doSum(numbers));
		doOutput("Sum squared",doSumSquared(numbers));
		doOutput("Average",doAverage(numbers));
		doOutput("Minimum",doMin(numbers));
		doOutput("Maximum",doMax(numbers));
		doOutput("Standard Deviation",doStdDev(numbers));
		
	}

	public static int[] readInput(String args)  throws FileNotFoundException
	{
		int length = getLength(args);
		int[] num = new int[length];
		Scanner reader = new Scanner(new File(args));
		for(int i=0; i<length; i++)
		{
			num[i] = reader.nextInt();
		}
		return num;
	}

	public static int getLength(String args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new File(args));
		int count = 0 ;
		while(reader.hasNextInt())
		{
			reader.nextInt();
			count++;
		}
		return count;
	}

	public static void doOutput(String title,double num)
	{

		System.out.println(title+" is: "+num);
	}

	public static double doSumSquared(int[] num)
	{
		double sum=0;
		for(int i:num)
		{
			double ii = (double)i*i;
			sum += ii;
		}
		return sum;
	}

	public static double doSum(int[] num)
	{
		double sum = 0;
		for(int i:num)
		{
			sum += (double)i;
		}
		return sum;
	}

	public static double doAverage(int[] num)
	{
		double sum = 0;
		for(int i:num)
		{
			sum += (double)i;
		}

		return (double)sum/num.length;
	}

	public static double doMin(int[] num)
	{
		int min = num[0];
		for(int i: num)
		{
			if(i<min)
				min = i;
		}return (double)min;
	}

	public static double doMax(int[] num)
	{
		int max = num[0];
		for(int i:num)
		{
			if(i>max)
				max = i;
		}return (double)max;
	}

	public static double doStdDev(int[] num)
	{
		double avg = doAverage(num);
		double var = 0;
		for(int i: num)
		{
			double sq = i-avg;
			sq = sq*sq;
			var += sq;
		}
		var = (double)var/num.length;
		return Math.sqrt(var);
	}
	
}
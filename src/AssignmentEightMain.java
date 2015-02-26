/**
 * Pongsathorn Cherngchaosil
 * Pongsakorn Cherngchaosil
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class AssignmentEightMain 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[][] temps = readTemps(args[0]);
		int month = getMonth();
		int day = getDay();
		
		displayAllTemps(temps);
		display("Temperature for " + getMonthName(month) + "," + day, getTemp(temps, month, day));
		display("Absolute maximum", getAbsoluteMax(temps));
		display("Absolute Minimum", getAbsoluteMin(temps));
		display("Minimum for " + getMonthName(month), getMinForMonth(temps, month));
		display("Minimum for day " + day, getMinForDay(temps, day));
		display("Average", getAverage(temps));
		display("Average for " + getMonthName(month), getAverageForMonth(temps, month));
		display("Average for day " + day, getAverageForDay(temps, day));
		
	}
	
	public static double getAverageForDay(int[][] temps, int d)
	{
		int t =0;
		for(int mon =0; mon < temps.length;  mon++)
		{
			t += temps[mon][d-1];
		}
		return (double)t/(double)temps .length;
	}
	
	public static double getAverageForMonth(int[][] temps, int month)
	{
		int t = 0;
		for(int i: temps[month-1])
		{
			t += i;
		}
		return (double)t/(double)temps[0].length;
	}
	
	public static double getAverage(int[][] temps)
	{
		int t = 0;
		for(int[] i :temps)
		{
			for(int ii: i )
			{
					t += ii;
			}
		}
		return (double)t/((double)temps.length*(double)temps[0].length);
	}
	
	public static double getMinForDay(int[][] temps, int day)
	{
		double min = temps[0][day];
		for(int col = 0; col < temps.length; col++)
		{
			if( min < temps[col][day])
				min = temps[col][day];
		}return min;
	}
	
	public static double getMinForMonth(int[][] temps, int month)
	{
		double min = temps[month-1][0];
		for(int i : temps[month-1])
		{
			if(i<min)
				min = i;
		}
		return min;
	}
	public static double getAbsoluteMax(int[][] temps)
	{
		double max = temps[0][0];
		for(int[] i :temps)
		{
			for(int ii: i )
			{
				if(ii>max)
					max = ii;
			}
		}
		return max;
	}
	
	public static double getAbsoluteMin(int[][] temps)
	{
		double min = temps[0][0];
		for(int[] i :temps)
		{
			for(int ii: i )
			{
				if(ii<min)
					min = ii;
			}
		}
		return min;
	}
	public static double getTemp(int[][] temps, int month,int day)
	{
		return (double)temps[month-1][day-1];
	}
	
	public static void display(String a, double b)
	{
		System.out.println(a +" is "+b);
	}
	public static String getMonthName(int i)
	{
		String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		return month[i-1];
	}
	
	public static void displayAllTemps(int[][] temps)
	{
		String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int iMon = 0;
		for(int col = 0; col < temps.length;col++)   // Display All temps
		{
			System.out.print(month[iMon]+" ");
			int avg = 0;
			for(int row = 0; row < temps[0].length; row++)
			{
				avg += temps[col][row];
				System.out.print(temps[col][row]+"\t");
			}System.out.println("Average: "+((float)avg/10));
			iMon++;
		}System.out.println();
		
		double[] avgDay = new double[10];
		int i = 0;
		for(int row = 0; row < temps[0].length;row++)   // Display Average for days
		{
			int avg = 0;
			for(int col = 0; col< temps.length; col++)
			{
				avg +=temps[col][row];
			}
			avgDay[i] =   Math.round(((double)avg/12) * 100.0) / 100.0;
			i++;
		}
		System.out.println("Averages for days\n");
		for(int ii =0; ii<avgDay.length; ii++)
		{
			System.out.print("Day " +(ii+1)+": " + avgDay[ii] +'\t' );
			if(ii == 4)
			{
				System.out.println();
			}
		}System.out.println();
	}
	public static int[][] readTemps(String args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new File(args));
		int[][] temp = new int[12][10];
		for(int col = 0; col < temp.length;col++)
		{
			for(int row = 0; row < temp[0].length; row++)
			{
				temp[col][row] = reader.nextInt();
			}
		}
		return temp;
	}
	
	private static int getMonth()
	{
		int month = 0;
		
		do
		{
			month = Integer.parseInt(
							JOptionPane.showInputDialog("Enter Month (1-12)"));
		} while(month < 1 || month > 12);
		
		return month;
				
	}

	private static int getDay()
	{
		int day = 0;
		
		do
		{
			day = Integer.parseInt(
							JOptionPane.showInputDialog("Enter Day (1-" + Integer.toString(NUM_DAYS_PER_MONTH) + ")"));
		} while(day < 1 || day > NUM_DAYS_PER_MONTH);
		
		return day;
	}

         private static final int NUM_DAYS_PER_MONTH = 10;

}
//Now that's a BIT odd.... Problem #2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Now_thats_a_BIT_odd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numExpress = Integer.parseInt(reader.nextLine());
		String[] input = new String[numExpress];
		int count = 0;
		while(numExpress > 0)
		{
			input[count] = reader.nextLine();
			count++;
			numExpress--;
		}
		for(String n:input)
		{
			outPut(n);
		}

	}
	
	public static void outPut(String n)
	{
		ArrayList<String> expression = new  ArrayList<String>(Arrays.asList(n.split("\\s+"))); //seperate string into array of element
		int Hex1 = Integer.parseInt(expression.get(0),16);
		int Hex2 = Integer.parseInt(expression.get(2),16);

		//int Hex1 = convert10(expression.get(0));
		//int Hex2 = convert10(expression.get(2));  //convert them integer
		if(expression.get(1).equals("+"))
		{
			System.out.println(convertBi(Hex1) +" "+expression.get(1)+" "+ convertBi(Hex2) +" = "+ (Hex1+Hex2));
		}
		else
		{
			if(expression.get(1).equals("-"))
			{
				System.out.println(convertBi(Hex1) +" "+expression.get(1)+" "+ convertBi(Hex2) +"="+ (Hex1-Hex2));
			}
		}
	}
	
	public static StringBuilder convertBi(int v)
	{
		StringBuilder binary = new StringBuilder("0000000000000");
		int pos = 12;
		while(v != 0)
		{
			if((v % 2) == 0 )
			{
			  binary.setCharAt(pos,'0');
			}
			else
			{
				binary.setCharAt(pos,'1');
			}
			v = v/2;
			pos --;
		}
		return binary;
	}
	public static int convert10(String in)
	{
		int value = 0;
		for(int i=0; i<in.length();i++)
		{
			int temp = in.charAt(in.length()-(i+1)); //get the last char
			if((temp>64)&&(temp<71))
			{
				value += (temp-55)*Math.pow(16,i);
			}
			else
			{
				if((temp>48)&&(temp<58))
				{
					value += (temp-48)*Math.pow(16,i);
				}
			}
		}
		return value; 
	}

}

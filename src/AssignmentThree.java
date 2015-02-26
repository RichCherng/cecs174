import java.io.File;
import java.util.Scanner;
import java.lang.Exception;

public class AssignmentThree
{
    public static void main(String[] args)
    {
    	Scanner sc = null;
    	
       	try
    	{
    		sc = new Scanner(new File(args[0]));
       
    		while(sc.hasNextInt())
    		{
    			int x = sc.nextInt();
    			int y = sc.nextInt();
    			int z = sc.nextInt();
    			
    			System.out.print("Input: " + x + ", " + y + ", " + z + " Sorted is: ");
    			int t;
    			if( x>y)
    			{
    				t = x;
    				x = y;
    				y = t;
    			}
    			if(y>z)
    			{
    				t = y;
    				y = z;
    				z = t;
    			}
    			if(x > y)
    			{
    				t = x;
    				x = y;
    				y = t;
    			}
    			System.out.println(x +"  , " + y+" , "+z);
    			
    		}
    	}
    	catch(Exception exc)
    	{
    		System.out.println("Error: " + exc.getMessage());
    	}
    	finally
    	{
    		if(sc != null) sc.close();
    	}
       	
    }
}
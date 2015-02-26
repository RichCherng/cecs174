import javax.swing.JOptionPane;

/* You must write the methods doOne, doTwo, doThree, doFour and doFive
 * to produce the patterns that my code produced.
 * 
 * Each method may have at most one occurrence of
 * 		System.out.print("*")
 * 		System.out.print(" ")
 * 		System.out.println()
 * 
 * You will need to use for or while loops to produce the desired
 * output.
 */
public class AssignmentSix 
{
	public static void main(String[] args)
	{
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter n"));
		System.out.println("\nn == " + n);
		doOne(n, "\nPattern 1");
		doTwo(n, "\nPattern 2");
		doThree(n, "\nPattern 3");
		doFour(n, "\nPattern 4");
		doFive(n, "\nPattern 5");
	}
	
	private static void doOne(int n, String title)
	{
		System.out.println(title);
		for(int i=1; i <= n; i++)
		{
			for(int ii = 0; ii<i;ii++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void doTwo(int n, String title)
	{
		System.out.println(title);
		for(int i=0; i < n; i++)
		{
			for(int ii = 0;ii<n-i; ii++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void doThree(int n, String title)
	{
		if(title.equals("\nPattern 3"))
			System.out.println(title);
		for(int i=0; i <((n+1)/2); i++)   
		{
			for(int ii = i; ii<n/2; ii++)
			{
				System.out.print(" ");
			}
			for(int a= n-((i*2)+1); a<n; a++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	private static void doFour(int n, String title)
	{
		if(title.equals("\nPattern 4"))
			System.out.println(title);
		for(int i=0; i<((n+1)/2); i++)
		{
			for(int ii=(n-i); ii < n; ii++)
			{
				System.out.print(" ");
			}
			for(int a=(i*2); a<n; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void doFive(int n, String title)
	{
		System.out.println(title);
		doThree(n,title);
		doFour(n,title);
		
	}
}
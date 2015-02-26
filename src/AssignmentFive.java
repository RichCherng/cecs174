import java.util.Random;

import javax.swing.JOptionPane;


public class AssignmentFive {
	public static void main(String[] args)
	{
		Random generator = new Random();
		int bankValue = bank(); //bank(): Asking for initial bank value
		int hand = 1;
		int b = bankValue;
		while((bankValue = play(bankValue, generator)) > 0) //play game and return bank value
		{ 
			hand++;
		}
		//JOptionPane.showMessageDialog (null, "Your Bank is empty\nYou lose!" );
		System.out.println("You played "+hand+" hands with an original bank of "+b);
		
	}
	
	
	
	public static int play(int bank,Random generator)
	{
		int wager;
		int roll = 1;
		if((wager = askWager(bank)) > bank)
		{
			wager = CFrame("Invalid Wager\n Enter New Wager");
		}
		int point,secondRoll;
		if((point = rollDice(generator)) == 7)
		{
			bank += wager;  // win and get wager
			System.out.println("You win Wager (" + wager + ") in 1 roll. Bank is "+ bank);
		}
		else
		{
			secondRoll = rollDice(generator);
			System.out.print("The point is "+point +"\n"+secondRoll+" ");
			while( (secondRoll != 7) && (secondRoll != point) ) //Keep rolling until the game can be determined
			{
				
				secondRoll = rollDice(generator);
				System.out.print(secondRoll+" ");
				roll ++;
			}
			
			if(secondRoll == 7)
			{
				bank -= wager;// lose wager
				System.out.println("\nYou lose Wager ("+wager+") in "+roll+" rolls. Bank is "+bank);
				//JOptionPane.showMessageDialog (null, "You lose!\n Your Bank is "+ bank );
			}
			else  // only alternative boolean is secondRoll = point
			{
				bank += wager; // win the game
				System.out.println("\nYou win Wager ("+wager+") in "+roll+" rolls. Bank is "+bank);
				//JOptionPane.showMessageDialog (null, "You win!\n Your Bank is "+ bank );
			}
		}
			
		return bank;
	}
	
	public static int rollDice(Random generator)   //generate number from 1-12
	{
		
		return generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
	}
	
	public static int askWager(int bank)   // asking for bet
	{
		return CFrame("Bank is: "+ bank+ " Enter amount for your Wager");
	}
	
	public static int bank()    //asking input for bank value
	{
		return CFrame("Enter amount for your bank");
	}
	
	public static int CFrame(String line)  //generate JFrame for input with text
	{
		return Integer.parseInt(JOptionPane.showInputDialog(null,line));
	}

}

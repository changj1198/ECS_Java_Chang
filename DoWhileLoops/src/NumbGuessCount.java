import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount {
public static void main(String[] args)
{
	Scanner keyboard =  new Scanner(System.in);
	Random r = new Random();
	int x = 1 + r.nextInt(10);
	int y = 1;
	int entry;
	System.out.println("I'm thinking of a number 1-10.  try to guess it.");
	 entry = keyboard.nextInt();
	do {
		if (entry != x)
		{
			System.out.println("Your guess: " + entry + ". Sorry, that is incorrect.");
		y = y + 1;
		System.out.println("Guess again.");
		entry = keyboard.nextInt();
		}
	}while (entry != x);
	
	if (y == 1)
	{
		System.out.println("Correct.  You took 1 try.");
	}
	else {
		{
	
	System.out.println("Correct.  You took " + y + " tries.");
		}	
		
	//** while ( entry != x)
	//{
		//System.out.println("\n Your guess: " + entry + "    Incorrect.  Try again.");
		//entry = keyboard.nextInt();
		//y = y + 1;
		
	//}
	//System.out.println("\n Your guess: " + entry + "     Correct.  Took you " + y + " tries."); **//
}
}
}

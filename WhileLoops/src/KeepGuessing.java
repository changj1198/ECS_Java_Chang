import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {
public static void main( String[] args)
{
	Scanner keyboard =  new Scanner(System.in);
	Random r = new Random();
	int x = 1 + r.nextInt(10);
	System.out.println("I'm thinking of a number 1-10.  try to guess it.");
	int entry = keyboard.nextInt();
	while ( entry != x)
	{
		System.out.println("\n Your guess: " + entry + "    Incorrect.  Try again.");
		entry = keyboard.nextInt();
		
	}
	System.out.println("\n Your guess: " + entry + "     Correct.");
	
}
}

import java.util.Scanner;
import java.util.Random;
public class HiLow {
public static void main( String[] args)
{
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	int choice  = 1 + r.nextInt(100);
	int name;
	
	System.out.println("I'm thinking of a number 1-100. Try to guess it.");
	name = keyboard.nextInt();
	
	if (name > choice)
	{
		System.out.println("Too high. The number was " + choice + ".");
	}
	else if (name == choice)
	{
		System.out.println("Nice.  You guessd it correct.");
		
	}
	else if (name < choice)
	{
		System.out.println("Too low.  The number was " + choice + ".");
	}
	keyboard.close();
}
}

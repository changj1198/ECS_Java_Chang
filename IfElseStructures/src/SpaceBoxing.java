import java.util.Scanner;

public class SpaceBoxing {
public static void main( String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	int weight;
	int planet;
	System.out.println("Please enter your current Earth weight.");
	weight = keyboard.nextInt();
	System.out.println("I have information about the following planets:");
	System.out.println("1) Venus   2) Mars     3) Jupiter");
	System.out.println("4) Saturn  5) Uranus   6) Neptune");
	System.out.println("Which planet do you plan on visiting?");
	planet = keyboard.nextInt();
	if (planet == 1)
	{
	System.out.println("Your weight would be " + (weight * 0.78) + " pounds.");	
	}
	else if (planet == 2)
	{
		System.out.println("Your weight would be " + (weight * 0.39) + " pounds.");	
	}
	else if (planet == 3)
	{
		System.out.println("Your weight would be " + (weight * 2.65) + " pounds.");
		
	}
	else if (planet == 4)
	{
		System.out.println("Your weight would be " + (weight * 1.17) + " pounds.");
		
	}
	else if (planet == 5)
	{
		System.out.println("Your weight would be " + (weight * 1.05) + " pounds.");	
	}
	else if (planet == 6)
	{
		System.out.println("Your weight would be " + (weight * 1.23) + " pounds.");
		
	}
	else 
	{
	System.out.println("Stop trying to mess me up.");
	}
	keyboard.close();
}
}

import java.util.Scanner;
import java.util.Random;
public class ShorterDoubleDice {
public static void main (String[] args ) {
Scanner keyboard = new Scanner(System.in);
Random rng = new Random();

String again;

do 
{
	int dice = rng.nextInt(6);
	
if (dice == 1)
	System.out.println("You rolled a " + dice);

else if (dice == 2) 
	System.out.println("You rolled a " + dice);

else if (dice == 3) 
	System.out.println("You rolled a " + dice);

else if (dice == 4) 
	System.out.println("You rolled a " + dice);

else if (dice == 5) 
	System.out.println("You rolled a " + dice);

else
	System.out.println("You rolled a 6." );

	System.out.println("Roll again? (y/n)");
	again = keyboard.next();
} while(again.equals("y"));
keyboard.close();
}
}
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
public class DoubleDice {
	public void p(String input){
		System.out.println(input);
	}
public static void main( String[] args)
{
	
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	int x = 1 + r.nextInt(5);
	int y = 1 + r.nextInt(5);
	System.out.println("Here comes the dice.");
	
	while (x != y)
	{
	System.out.println("Roll 1: " + x);
	System.out.println("Roll 2: " + y);
	System.out.println("The total is " + (x + y));
	x = 1 + r.nextInt(5);
	y = 1 + r.nextInt(5);
	}
	System.out.println("Roll 1: " + x);
	System.out.println("Roll 2: " + y);
	System.out.println("The total is " + (x + y));
	
}
}


import java.util.Scanner;
public class HowOldSpecifically {
public static void main ( String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	String name;
	int age;
	System.out.println("Hey, what's your name?");
	name = keyboard.next();
	System.out.println("Ok " + name + ", how old are you?");
	age = keyboard.nextInt();
	if (age < 16)
	{
		System.out.println("You can't drive.");
	}
	else if (16 == age || age == 17)
	{
		System.out.println("You can drive but not vote.");
		
	}
	else if (age > 17 && age <= 24)
	{
		System.out.println("You can vote but not rent a car.");
	}
	else
	{
		System.out.println("You can pretty much do anything you want.");
	}
keyboard.close();
}
}

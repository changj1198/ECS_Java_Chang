import java.util.Scanner;
public class TwoQuestions {
	
public static void main( String[] args)
{
Scanner keyboard = new Scanner(System.in);
String anima, yesuh;

System.out.println("Think of an object, and I'll guess what it is.");
System.out.println("Is it an animal, vegatable, or mineral?");
anima = keyboard.next();

if (anima.equals("animal"))
{
	System.out.println("Is it bigger than a breadbox?");
	yesuh = keyboard.next();
	if (yesuh.equals("yes"))
	{
		System.out.println("It's a moose!");
	}
	else if (yesuh.equals("no"))
	{
		System.out.println("It's a squirrel.");
	}
	else {
		System.out.println("Stop trolling me.");
	}
}


else if (anima.equals("vegetable"))
{
	System.out.println("Is it bigger than a breadbox?");
	yesuh = keyboard.next();
	if (yesuh.equals("yes"))
	{
		System.out.println("It's a watermelon!");
	}
	else if (yesuh.equals("no"))
	{
		System.out.println("It's a carrot.");
	}
	else {
		System.out.println("Stop trolling me.");
	}
}


else if (anima.equals("mineral"))
{
	System.out.println("Is it bigger than a breadbox?");
	yesuh = keyboard.next();
	if (yesuh.equals("no"))
	{
		System.out.println("It's a paper clip!");
	}
	else if (yesuh.equals("yes"))
	{
		System.out.println("It's a camaro.");
	}
	else {
		System.out.println("Stop trolling me.");
	}
}
keyboard.close();

}
}

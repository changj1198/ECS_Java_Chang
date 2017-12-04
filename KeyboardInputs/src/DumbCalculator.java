import java.util.Scanner;
public class DumbCalculator {
public static void main( String[] args)
{
	Scanner keyboard= new Scanner(System.in);
	int number1, number2, number3;
	System.out.println("Let's find the average of a few numbers...");
	System.out.println("What is the first number?");
	number1 = keyboard.nextInt();
	System.out.println("What is the second number?");
	number2 = keyboard.nextInt();
	System.out.println("What is the third number?");
	number3 = keyboard.nextInt();
	System.out.println("The average of the three numbers is " + ((number1 + number2 + number3)/3) + ".");
	
}
}

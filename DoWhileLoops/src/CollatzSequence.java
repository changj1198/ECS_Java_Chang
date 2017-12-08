import java.util.Scanner;
public class CollatzSequence {
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);
int x;
System.out.println("Let's create a Collat sequence.");
System.out.println("Rules:");
System.out.println("If the number is even, divide it by 2.");
System.out.println("Repeat this number until you reach 1.");
System.out.println("Starting number: ");
x = keyboard.nextInt();
System.out.print(x + " - ");

do {
	if (x%2 ==0)
	{
		x = x/2;
		if (x != 1)
		{
		System.out.print(x + " - ");
		}
		else if (x == 1)
		{
			System.out.print(x);
		}
	}
	else if (x%2 != 0)
	{
		x = (x*3) +1;
		System.out.print(x + " - ");
	}
	
} while (x != 1);

}
}

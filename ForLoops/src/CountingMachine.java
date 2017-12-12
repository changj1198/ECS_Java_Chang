import java.util.Scanner;
public class CountingMachine {
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	int x, y;
	y = 0;
	System.out.println("Count to: ");
	x = keyboard.nextInt();
	for (y = 0 ; y <= x ; y = y + 1)
	{
		System.out.print(y + " ");
	}
}
}

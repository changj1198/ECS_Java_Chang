import java.util.Scanner;
public class ALittleQuiz {
public static void main ( String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	int correct;
	int correcttwo;
	int correctthree;
	int first;
	int second;
	int third;
	
	System.out.println("What is the capital of Alaska?");
	System.out.println("1) Melbourne");
	System.out.println("2) Anchorage");
	System.out.println("3) Juneau");
	first = keyboard.nextInt();
	if (first == 3)
	{
		System.out.println("Correct!");
		 correct = 1;
	}
	else
	{
		System.out.println("Incorrect.");
		correct = 0;
	}
	System.out.println("How many hearts does an octopus have?");
	System.out.println("1) 1");
	System.out.println("2) 3");
	System.out.println("3) 7");
	second = keyboard.nextInt();
	if (second == 2)
	{
		System.out.println("Correct!");
		correcttwo = 1;
	}
	else
	{
		System.out.println("Incorrect.");
		correcttwo = 0;
	}
	System.out.println("What is the square root of 64?");
	System.out.println("1) 4"); 
	System.out.println("2) 8");
	System.out.println("1) 32");
	third = keyboard.nextInt();
	if (third == 2)
	{
		System.out.println("Correct!");
		correctthree = 1;
	}
	else
	{
		System.out.println("Incorrect.");
		correctthree = 0;
	}
	if (correct + correcttwo + correctthree == 3)
	{
		System.out.println("You got 3 out of 3! Nice!");
	}
	if (correct + correcttwo + correctthree == 2)
	{
		System.out.println("You got 2 out of 3! Good job!");
	}
	else
	{
		System.out.println("Just face it...you failed.");
	}
	keyboard.close();
}
}

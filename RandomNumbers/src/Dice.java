import java.util.Random;
public class Dice {
public static void main( String[] args)
{
	Random r = new Random();
	int one, two;
	one = 1 + r.nextInt(5);
	two = 1 + r.nextInt(5);
	
	System.out.println("Here come the dice!");
	
	System.out.println("Roll #1: " + one);
	System.out.println("Roll #2: " + two);
	
System.out.println("The total is " + (one + two));
}
}

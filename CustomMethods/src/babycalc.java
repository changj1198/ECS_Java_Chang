
import java.util.Scanner;
public class babycalc {
public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Give me math procedure.");
	String num1 = keyboard.next();
	String opp = keyboard.next();
	String num2 = keyboard.next();
	System.out.println();
	
	System.out.println(num1);
	System.out.println(opp);
	System.out.println(num2);
	
	System.out.println("You want to (" + opp + "): " + num1 + " and " + num2 + "." );
	
}
}

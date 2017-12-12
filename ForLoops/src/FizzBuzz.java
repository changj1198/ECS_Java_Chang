import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
public class FizzBuzz {
public static void main( String[] args)
{
	for (int x = 1; x < 101; x++) 
	{
		if ((x % 3) == 0 && (x % 5) == 0) {
			System.out.println("Fizzbuzz");
			
		}else if ((x % 5) == 0){
			System.out.println("Buzz");
			
		}else if ((x % 3) == 0){
			System.out.println("Fizz");
			
		}else {
			System.out.println(x);
			
		}
	}	
}
}

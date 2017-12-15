import java.util.Scanner;

public class prime {
public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int x, y, z, b, c;
	System.out.println("Count from: ");
	b = keyboard.nextInt();
	System.out.print("Count to: ");
	y = keyboard.nextInt();
	
	
	for (int v = b; v <= y ; v = v + z ){
		System.out.print(v + " ");
	}
}
}

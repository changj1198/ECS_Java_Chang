
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
public class MethodPass {
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	

	System.out.println("Pick a number.");
	int x = keyboard.nextInt();
	boolean z = check(x);
	if(z == false){
		System.out.print("That number is gross.");
	}else{
		System.out.print("I like that number");
	}
	
	keyboard.close();
}
public static boolean check(int y){
	if (y % 3 != 0) {
		return false;
		
	}else{
		return true;
		
	}
}



	

}

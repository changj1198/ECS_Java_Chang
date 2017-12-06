import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
public class BMICalcBetter {

	
public static void main( String[] args)
{
Scanner keyboard = new Scanner(System.in);
double BMI, weight, inches, feet;
System.out.println("How many feet tall are you?");
feet = keyboard.nextInt();
System.out.println("How many inches?");
inches = keyboard.nextInt();
inches = inches + (feet * 12);
System.out.println("How many pounds do you weigh?");
weight = keyboard.nextInt();
BMI = (weight*0.4536) / ((inches*0.0254)*(inches*0.0254));
if (BMI < 18.5)
{
	System.out.println("Your BMI is " + BMI + ".Underweight.");
}
else if (BMI > 18.5 && BMI < 25)
{
	System.out.println("Your BMI is " + BMI + ".Normal weight.");
}
else if (BMI > 24.9 && BMI < 30)
{
	System.out.println("Your BMI is " + BMI + ".Overweight.");
}
else if (BMI > 29.9)
{
System.out.print("Your BMI is " + BMI + ". Obese.");	
}
else
{
	System.out.println("WHAT??");
}
keyboard.close();
}
}

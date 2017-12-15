
import java.util.Scanner;


public class AreaCalc {

	public void initert(){

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What shape would you like the area of? Circle, Triangle, Square, Rectangle? ");
		String selectd = keyboard.next();
		keyboard.close();
		selectg(selectd);
	}
	public void selectg(String af) {
		af = af.toLowerCase();
		double b;
		switch (af) {
		case "triangle": b = areatri(); System.out.println(b); break;
		case "circle": b = areacircle(); System.out.println(b); break;
		case "square": b = areasquare(); System.out.println(b); break;
		case "rectangle": b = arearect(); System.out.println(b); break;
		
		}
	}
	private double qer(String input){
		double c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println(input);
		c = keyboard.nextDouble();
		keyboard.close();
		return c;
		
	}
	
	public double areacircle(){
		double radius = qer("Whats the radius? ");
		double out = (Math.PI * radius * radius);
		return out;
		
	}
	public double arearect(){
	double ar = qer("What is the length? ");
	double ra = qer("What is the width? ");
	double rr = (ar * ra);
	return rr;
	}
	public double areasquare(){
	double am = qer("What is the side length?");
	double ma = Math.pow(am,2);
	return ma;
	}
	public double areatri(){
	double de = qer("What is the base? " );
	double ed = qer("What is the height? ");
	double dee = (de * ed);
	double eed = (dee / 2);
	return eed;
}
}

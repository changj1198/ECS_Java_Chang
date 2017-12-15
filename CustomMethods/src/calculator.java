import java.util.Scanner;
public class calculator {
public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	String x;
	System.out.println("This is a calculator!");
	System.out.println("Insert you calculation as ###:operator:###");
	x = keyboard.next();
	keyboard.close();
	int c = v(x);
	if (c != 0){
		System.out.println(c);	
	}
}

public static int v(String x){
	String t;
	
	String[] k = x.split(":");
	int b = Integer.parseInt(k[0]);
	int c = Integer.parseInt(k[2]);
	t = k[1];
	
	if(t.equals("+")){
		int p = (b + c);
		return(p);
	}else if(t.equals("-")){
		int p = (b - c);
		return(p);
	}else if(t.equals("*")){
		int p = (b * c);
		return(p);
	}else if(t.equals("/")){
		int p = (b / c);
		return(p);
	}else {
		double p = Math.pow(b,c);
		System.out.print(p);
		return 0;
	}
	
	
	
	}
}



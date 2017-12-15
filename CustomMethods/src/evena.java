
public class evena {

	public static void main(String[] args) {
		for (int x = 1; x < 101; x++) 
		{
			boolean y = e(x);
			boolean z = f(x);
			if (y == true && z == true){
				System.out.println("<= " + x);
			}else if(y == true){
				System.out.println("< " + x);
			}else{
				System.out.println("= " + x);
			}
			
		}	

	}
	public static boolean e(int x){
		if (x % 2 == 0){
		return true;
		
		}else{
			return false;
		}	
	}
	public static boolean f(int x){
		if (x % 3 == 0){
			return true;
			
			}else{
				return false;
			}	
	}

}

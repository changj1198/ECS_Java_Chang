
public class SelectionStructures {
public static void main ( String[] args)
{
	int people = 30;
	int cars = 40;
	int buses = 15;
	
	if ( cars > people )
	{
		System.out.println("We should take the cars.");
	}
	else if ( cars < people )
	{
		System.out.println("We shouldn't take the cars.");
	}
	else 
	{
		System.out.println("We can't decide.");
	}
	
	if ( buses > cars )
	{
		System.out.println("That's too many buses.");
	}
	else if ( buses < cars)
	{
		System.out.println("Maybe we could take the buses.");
	}
	else {
		System.out.println("We still can't decide.");
	}
	if (people > buses)
	{
		System.out.println( "Alright, let's just take the buses.");
	}
	else 
	{
		System.out.println("Let's stay home then...");
	}
}
}
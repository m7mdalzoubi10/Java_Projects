import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = input.nextInt();
		
		if(number%5==0 && number%6==0) 
		{System.out.println("divisible by both 5 and 6");}
		
		else if(number%5==0 || number%6==0)
		{System.out.println("divisible by 5 or 6");}
		
		else 
		System.out.println("divisible by neither 5 nor 6");
	}
}

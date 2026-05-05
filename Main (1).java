import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number of mintues: ");
        int min = input.nextInt();	
	    
        int totalDays = min / (24 * 60);
        int year = totalDays / 365;
        int day = totalDays % 365;


	    System.out.println( year +"Years "+ day +" days ");
	}
}

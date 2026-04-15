import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int sum = 0;

        for (int counter = 0; counter < array.length ; counter++) 
        {
            System.out.print("Please enter Array[" + (counter + 1) + "]: ");
            
            array[counter] = input.nextInt();
            sum += array[counter];
        }


        double average = calculateAverage(sum);
        System.out.println("\n Average = " + average);
        
        int countAboveAverage = countAboveAverage(array, average);
        System.out.println("\n countAboveAverage = " + countAboveAverage);
        
        System.out.println();
        sortArray(array);
    }
    
//----------------------------calculateAverage Method-----------------------------------//    

    public static double calculateAverage(int sum) 
    {
        return (double) sum / 10;
    }
    
//------------------------countAboveAverage Method---------------------------------------//    

    public static int countAboveAverage(int[] array , double average) 
    {
        int countAboveAverage = 0;

        for (int counter = 0; counter < array.length; counter++) 
        {
            if (array[counter] > average) 
            {
                ++countAboveAverage;
            }
        }

        return countAboveAverage;
    }
    
//------------------------sortArray Method---------------------------------------//    

    public static void sortArray(int[] array)
    {
        for (int counter = 0; counter < array.length; counter++) 
        {
            System.out.print(array[counter] + " - ");
        }
        
    }
}




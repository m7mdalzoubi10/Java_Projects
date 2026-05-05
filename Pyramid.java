public class Pyramid 
{
    public static void main(String[] args) 
    {
        int rows = 7;
        int power = 1;

        for (int i = 1; i <= rows; i++) 
        {
            
            for (int space = rows; space > i ; space--) 
            {
                System.out.print("--");
            }
            
            for (int j = 0; j < i; j++) 
            {
                System.out.print(power + " ");
                power = power * 2;
            }
            
            power = power/2; 
            for (int j = i - 2; j >= 0; j--) 
            {
                power = power / 2;
                System.out.print(power + " ");
            }
            
            System.out.println();
        }
    }
}
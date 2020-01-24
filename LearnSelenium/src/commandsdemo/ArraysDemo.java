package commandsdemo;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) 
    {
        int n, evensum = 0, oddsum = 0;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++)
        {
            numbers[i] = sc.nextInt();
        }
 
        for(int i = 0; i < n; i++)
        {
            if(numbers[i]%2 == 0)
            {
                evensum = evensum + numbers[i];
            }
            else
            {
                oddsum = oddsum + numbers[i];
            }
        }
 
        System.out.println("Sum of Even Numbers is:"+evensum);
        System.out.println("Sum of Odd Numbers is:"+oddsum);
        
        sc.close();
    }
}
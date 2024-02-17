/*
  Enter the number of elements in the array
  5
  Enter the elements in the array
  2
  4
  1
  3
  5
  The median of the array is 3.00
*/
import java.util.*;

public class Demo 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n =scn.nextInt();

        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];

        double median;

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        scn.close();

        Arrays.sort(arr);

        if(n % 2 == 0)
        {
            int x = arr[(n - 1) / 2];
            int y = arr[n / 2];

            median = (x + y) / 2;
        }
        else
        {
            median = arr[(n - 1) / 2];
        }

        System.out.printf("The median of the array is %.2f", median);


    }
    
}

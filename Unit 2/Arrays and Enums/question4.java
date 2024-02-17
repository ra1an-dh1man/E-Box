/*
  Enter the number of elements in the array
  5
  Enter the elements in the array
  1
  2
  3  
  4
  5
  Enter the location where you wish to delete an element
  4
  Array after deletion is
  1
  2
  3
  5
*/
import java.util.*;

public class Demo 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the elements in the array");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the location where you wish to delete an element");
        int location = scn.nextInt();

        scn.close();

        if(location <1 || location > n)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(int i = location - 1; i < n - 1; i++)
        {
            arr[i] = arr[i+1];
        }

        for(int i = 0 ; i  < n - 1; i++)
        {
            System.out.println(arr[i]);
        }
        scn.close();

    }
    
}

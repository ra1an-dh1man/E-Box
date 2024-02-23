/*
  Write a program to find the number of distinct elements in a unsorted array. [Do it without sorting the array]
*/
import java.util.*;

public class Demo 
{
    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n  ; i++)
        {
            arr[i] = scn.nextInt();
        }
        scn.close();


        Set<Integer> dist = new HashSet<>();

        for(int i = 0 ; i < n; i++)
        {
            dist.add(arr[i]);
        }
        System.out.println(dist.size());
        
    }
    
}

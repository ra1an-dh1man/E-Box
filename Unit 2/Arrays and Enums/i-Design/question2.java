/*
Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than 
or equal to the ith element in the second array for all ‘i’.  Write a  program to find whether 2 arrays are compatible or not
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = scn.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            b[i] = scn.nextInt();
        }
        scn.close();

        boolean res = true;

        for(int i = 0 ; i  < n ; i++)
        {
            if(!(a[i] >= b[i]))
            {    
                res = false;
                break;
            }
            
        }

        if(res == false)
            System.out.println("Incompatible");
        else   
            System.out.println("Compatible");
    }
}

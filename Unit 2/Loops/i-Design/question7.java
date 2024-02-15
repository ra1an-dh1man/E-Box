/*
  Write a program to read in numbers until the number -999 is encountered. The sum of all numbers read until this point should be printed out. (exclude -999 when calculating the sum)
*/
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner scn = new Scanner(System.in);

        int sum = 0;
        
        while (true) {
            int n = scn.nextInt();
            if(n == -999)
                break;
            else
                sum = sum + n; 
            
        }
        scn.close();

        System.out.println("The sum is " + sum);
    }
}

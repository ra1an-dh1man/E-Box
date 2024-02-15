/*
input->5
output-> 
*
**
***
****
*****     
*/

import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <=n ;i++)
        {
            for(int j = i ; j >=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

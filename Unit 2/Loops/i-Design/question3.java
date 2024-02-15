/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
import java.util.*;

class Demo
{
    public static void main(String args[])
    {
        //Fill your code here;

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i= 1 ; i<=n; i++)
        {
            for(int j = n ;  j>=i;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

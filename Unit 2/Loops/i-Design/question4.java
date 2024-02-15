
/*
  ****
  ****
  ****
  ****
*/
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        // Scanner scn = new Scanner(System.in);

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i= 1 ; i<=n; i++)
        {
            for(int j = 1 ;  j<=n;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

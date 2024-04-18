/*
input->  100
         0
output-> java.lang.ArithmeticException: / by zero


input-> 100
        20
output->Cost per day of the item is 5
*/
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter the cost of the item for n days");
        int cost = Integer.parseInt(scn.nextLine());

        System.out.println("Enter the value of n");
        int n = Integer.parseInt(scn.nextLine());

        scn.close();

        try
        {
            if(n > 0)
            {
                System.out.println("Cost per day of the item is " + cost / n);

            }
            else
            {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



    }
}

/*
Sample Input and Output 1:

Enter an integer input
5
Entered value is 5

Sample Input and Output 2:

Enter an integer input
5.0
java.util.InputMismatchException
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try{
            System.out.println("Enter an integer input");
            int n = scn.nextInt();
            scn.close();
            System.out.println("Entered value is " + n);

            
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.toString());
            System.exit(0);
        }


    }

}

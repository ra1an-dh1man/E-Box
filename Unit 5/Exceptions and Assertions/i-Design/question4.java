/*
Sample Input and Output 1:

Enter the number of seats to be booked:
5
Enter the seat number 1
23
Enter the seat number 2
42
Enter the seat number 3
65
Enter the seat number 4
81
Enter the seat number 5
100
The seats booked are:
23
42
65
81
100

Sample Input and Output 2:

Enter the number of seats to be booked:
4
Enter the seat number 1
12
Enter the seat number 2
101
java.lang.ArrayIndexOutOfBoundsException: 100
*/
import java.util.Scanner;

public class Main {

     public static void main(String[] args) 
     {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of seats to be booked:");
        int n = scn.nextInt();
        
        int[] book = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the seat number " + (i+1));
            book[i] = scn.nextInt();

            try
            {
                if(book[i] > 100 || book[i] < 0 )
                {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                int val = book[i] - 1;
                System.out.println(e.toString() + ": " + val);
                System.exit(0);
            }
        }

        System.out.println("The seats booked are:");
        for(int a : book)
        {
            System.out.println(a);
        }


     }
}

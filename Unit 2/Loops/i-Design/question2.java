/*
Factorial
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.close();

        int fact = 1;
        if(n == 0)
            System.out.println("1");
        else
        {
            for(int i = 1; i <= n ; i++)
            {
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
    
}

/*
Write a program to generate numbers between the given range and print the numbers which are divisible by 2 and not divisible by 3 and 5.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        
        scn.close();

        for(int i = a ; i <= b; i++)
        {
            if(i%2 == 0 && i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
    
}

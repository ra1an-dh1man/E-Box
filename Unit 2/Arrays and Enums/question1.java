/*
input ->
5
2
3
6
1
output->
The sum of the elements is 20
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int sum = 0;

        for(int i = 0 ; i  < n ; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("The sum of the elements is " + sum);
    }
}

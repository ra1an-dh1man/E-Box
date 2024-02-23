/*
input:  5
        3
        2
output: 5 4 3 2 1
        10 9 8 7 6
        15 14 13 12 11
        20 19 18 17 16
        25 24 23 22 21
        14
input:  6
        4
        5
output: 6 5 4 3 2 1
        12 11 10 9 8 7
        18 17 16 15 14 13
        24 23 22 21 20 19
        30 29 28 27 26 25
        36 35 34 33 32 31
        20
*/
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[n][n];
		int count = n;
		for (int i = 1; i <= n; i++) {
			count = n * i;
			for (int j = 1; j <= n; j++) {
				arr[i - 1][j - 1] = count;
				System.out.print(arr[i - 1][j - 1] + " ");
				count--;
			}
			System.out.println();
		}
		System.out.println(arr[row - 1][col - 1]);

	}
}

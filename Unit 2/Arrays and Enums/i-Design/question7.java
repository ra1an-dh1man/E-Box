/*
input:  5
        3
        2
output: 1 2 3 4 5
        10 9 8 7 6
        11 12 13 14 15
        20 19 18 17 16
        21 22 23 24 25
        12
input:  6
        4
        5
        
output: 1 2 3 4 5 6
        12 11 10 9 8 7
        13 14 15 16 17 18
        24 23 22 21 20 19
        25 26 27 28 29 30
        36 35 34 33 32 31
        20
*/
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[n][n];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= n; j++) {
					count++;
					arr[i - 1][j - 1] = count;
					System.out.print(arr[i - 1][j - 1] + " ");
				}
			} else {
				int temp = n * i;
				for (int j = 1; j <= n; j++) {
					arr[i - 1][j - 1] = temp;
					System.out.print(arr[i - 1][j - 1] + " ");
					temp--;
				}
				count = n * i;
			}
			System.out.println();
		}
		System.out.println(arr[row - 1][col - 1]);
	}
}

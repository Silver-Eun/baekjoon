package Bronze_IV;

import java.util.Scanner;

public class ex30031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			if (arr[i][0] == 136 && arr[i][1] == 68)
				total += 1000;
			else if (arr[i][0] == 142 && arr[i][1] == 68)
				total += 5000;
			else if (arr[i][0] == 148 && arr[i][1] == 68)
				total += 10000;
			else if (arr[i][0] == 154 && arr[i][1] == 68)
				total += 50000;
		}
		
		sc.close();

		System.out.println(total);
	}

}

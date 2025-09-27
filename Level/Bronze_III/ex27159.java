package Bronze_III;

import java.util.Scanner;

public class ex27159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		int sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int groupMin = arr[0];

		for (int i = 1; i < N; i++) {
			if (arr[i] - arr[i - 1] != 1) {
				sum += groupMin;
				groupMin = arr[i];
			}
		}

		sum += groupMin;

		System.out.println(sum);
		
		sc.close();
	}

}

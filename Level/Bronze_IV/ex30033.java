package Bronze_IV;

import java.util.Scanner;

public class ex30033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			arr2[i] = sc.nextInt();
			if (arr1[i] <= arr2[i])
				cnt++;
		}
		
		sc.close();

		System.out.println(cnt);
	}

}

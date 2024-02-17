package step9;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 입력 수
			int n = sc.nextInt();

			if (n == -1)
				break;

			// 약수 담을 배열
			int[] arr = new int[n];
			// 약수들의 합
			int sum = 0;
			// 약수 담을 배열의 인덱스
			int index = 0;
			for (int i = 1; i < n; i++) {
				// 약수일 때
				if (n % i == 0) {
					// 약수 저장
					arr[index++] = i;
					// 약수 합
					sum += i;
				}
			}

			if (sum != n) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}

			System.out.print(n + " = ");
			for (int i = 0; i < index; i++) {
				if (i == index - 1)
					System.out.print(arr[i]);
				else
					System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}

		sc.close();
	}

}
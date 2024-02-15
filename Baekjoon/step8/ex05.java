package step8;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 방 번호
		int N = sc.nextInt();
		// 겹 수(최소 루트)
		int count = 1;
		// 범위 (최솟값 기준)
		int range = 2;

		if (N == 1) {
			System.out.println(1);
		} else {
			// 범위가 N보다 커지기 직전까지 반복
			while (range <= N) {
				// 다음 범위의 최솟값으로 초기화
				range = range + (6 * count);
				// count 1 증가
				count++;
			}
			System.out.print(count);
		}
		
		sc.close();

	}

}

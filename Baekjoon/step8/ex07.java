package step8;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 낮에 올라갈 수 있는 거리
		int A = sc.nextInt();
		// 밤에 미끄러지는 거리
		int B = sc.nextInt();
		// 나무 막대의 높이
		int V = sc.nextInt();
		
		// 올라가는데 걸리는 날
		int D = (V - B) / (A - B);

		// 나머지가 있을 경우
		if ((V - B) % (A - B) != 0) {
			D++;
		}

		System.out.println(D);

		sc.close();
	}

}

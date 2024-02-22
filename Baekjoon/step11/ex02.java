package step11;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// n만큼 for 문을 통해 n번 반복하기 때문에 수행 횟수는 n번
		System.out.println(n);
		// 식으로 표현을 하면 n이 되기 때문에 최고 차수가 1
		System.out.println(1);

		sc.close();
	}

}

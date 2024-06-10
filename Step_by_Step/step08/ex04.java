package step08;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 과정 횟수
		int N = sc.nextInt();
		// 초기값
		int a = 2;
		
		for (int i = 0; i < N; i++) {
			a = (2*a-1);
		}
		
		System.out.println(a*a);
		sc.close();
	}

}

package step10;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 가로, 세로
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 높이
		System.out.println(A*B);
		
		sc.close();
	}

}

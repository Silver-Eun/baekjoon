package step10;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 삼각형의 세 변
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if(A+B+C == 180 && A == B || A == C || B == C) {
			System.out.println("Isosceles");
		} else if(A+B+C == 180 && A != B && A != C && B != C) {
			System.out.println("Scalene");
		} else if(A+B+C != 180) {
			System.out.println("Error");
		}
		
		sc.close();
	}

}

package Bronze_IV;

import java.util.Scanner;

public class ex31668 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		sc.close();

		int a = M / N;

		System.out.println(a * K);
	}

}

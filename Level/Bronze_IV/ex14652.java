package Bronze_IV;

import java.util.Scanner;

public class ex14652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		sc.close();

		System.out.print((K / M) + " " + (K % M));
	}

}

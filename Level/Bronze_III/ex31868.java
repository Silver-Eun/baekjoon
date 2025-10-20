package Bronze_III;

import java.util.Scanner;

public class ex31868 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double N = sc.nextDouble();
		Double K = sc.nextDouble();

		Double k = Math.pow(2, N - 1);

		System.out.println((int)(K / k));

		sc.close();
	}

}

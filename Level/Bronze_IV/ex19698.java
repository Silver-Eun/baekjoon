package Bronze_IV;

import java.util.Scanner;

public class ex19698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();

		sc.close();

		int a = ((W / L) * (H / L));

		if (N <= a)
			System.out.println(N);
		else
			System.out.println(a);
	}

}

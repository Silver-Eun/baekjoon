package Bronze_IV;

import java.util.Scanner;

public class ex11943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		sc.close();

		int cnt = 0;

		if ((A + D) > (B + C))
			cnt = (B + C);
		else
			cnt = (A + D);

		System.out.println(cnt);
	}

}

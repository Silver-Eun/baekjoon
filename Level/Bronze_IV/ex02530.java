package Bronze_IV;

import java.util.Scanner;

public class ex02530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();

		int D = sc.nextInt();
		
		M += D / 60;
		S += D % 60;

		M += S / 60;
		S = S % 60;

		H += M / 60;
		M = M % 60;

		H = H % 24;

		System.out.println(H + " " + M + " " + S);
		sc.close();
	}

}

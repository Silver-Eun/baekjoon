package Bronze_III;

import java.util.Scanner;

public class ex25915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char A = sc.next().charAt(0);
		String B = "ILOVEYONSEI";

		int cost = Math.abs(A - B.charAt(0));

		for (int i = 0; i < B.length() - 1; i++) {
			cost += Math.abs(B.charAt(i) - B.charAt(i + 1));
		}
		
		System.out.println(cost);
		
		sc.close();
	}

}

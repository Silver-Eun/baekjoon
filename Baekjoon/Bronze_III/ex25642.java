package Bronze_III;

import java.util.Scanner;

public class ex25642 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String[] b = a.split(" ");

		int A = Integer.valueOf(b[0]);
		int B = Integer.valueOf(b[1]);

		for (int i = 0; i < 5; i++) {
			B += A;
			if (5 <= A || 5 <= B)
				break;
			A += B;
			if (5 <= A || 5 <= B)
				break;
		}

		if (A < B) {
			System.out.println("yt");
		} else {
			System.out.println("yj");
		}

		sc.close();
	}

}

package Bronze_IV;

import java.util.Scanner;

public class ex29790 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int U = sc.nextInt();
		int L = sc.nextInt();

		sc.close();

		if (1000 <= A && (8000 <= U || 260 <= L))
			System.out.println("Very Good");
		else if (1000 <= A && (U < 8000 || L < 260))
			System.out.println("Good");
		else
			System.out.println("Bad");

	}

}

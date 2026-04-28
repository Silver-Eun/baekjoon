package Bronze_III;

import java.util.Scanner;

public class ex27736 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int approved = 0;
		int rejected = 0;
		int invalid = 0;

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();

			if (a == 1)
				approved++;
			else if (a == -1)
				rejected++;
			else
				invalid++;
		}

		if (((N + 1) / 2) <= invalid)
			System.out.println("INVALID");
		else if (approved < rejected || approved == rejected)
			System.out.println("REJECTED");
		else if (approved > rejected)
			System.out.println("APPROVED");

		sc.close();

	}

}

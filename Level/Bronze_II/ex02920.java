package Bronze_II;

import java.util.Scanner;

public class ex02920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean asc = true;
		boolean desc = true;

		for (int i = 0; i < 7; i++) {
			if (arr[i + 1] - arr[i] != 1)
				asc = false;
			if (arr[i + 1] - arr[i] != -1)
				desc = false;
		}

		if (asc)
			System.out.println("ascending");
		else if (desc)
			System.out.println("descending");
		else
			System.out.println("mixed");

		sc.close();
	}

}

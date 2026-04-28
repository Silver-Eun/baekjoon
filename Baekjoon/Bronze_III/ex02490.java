package Bronze_III;

import java.util.Scanner;

public class ex02490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[3];

		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			String[] A = sc.nextLine().split(" ");

			for (int j = 0; j < 4; j++) {
				if (A[j].equals("1")) {
					cnt++;
				}
			}
			if (cnt == 0)
				arr[i] = "D";
			else if (cnt == 1)
				arr[i] = "C";
			else if (cnt == 2)
				arr[i] = "B";
			else if (cnt == 3)
				arr[i] = "A";
			else if (cnt == 4)
				arr[i] = "E";
		}

		sc.close();
		
		for(String a : arr)
			System.out.println(a);
	}

}

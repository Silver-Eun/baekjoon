package Bronze_IV;

import java.util.Scanner;

public class ex27918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] arr = new String[N];

		int X = 0;
		int Y = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
			if (arr[i].equals("D"))
				X++;
			else if (arr[i].equals("P"))
				Y++;

			if (Math.abs(X - Y) >= 2)
				break;
		}

		sc.close();

		System.out.println(X + ":" + Y);

	}

}

package Bronze_II;

import java.util.Scanner;

public class ex02948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int M = sc.nextInt();

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] week = { "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday" };

		int sumM = 0;

		for (int i = 0; i < M - 1; i++) {
			sumM += days[i];
		}

		int total = sumM + D;

		int day = (total - 1) % 7;

		System.out.println(week[day]);

		sc.close();
	}
}

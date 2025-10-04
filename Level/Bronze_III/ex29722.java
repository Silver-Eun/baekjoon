package Bronze_III;

import java.util.Scanner;

public class ex29722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String d = sc.nextLine();
		int N = sc.nextInt();

		String[] a = d.split("-");

		int year = Integer.valueOf(a[0]);
		int month = Integer.valueOf(a[1]);
		int day = Integer.valueOf(a[2]);

		day += N;

		if (30 < day) {
			month += (day - 1) / 30;
			day = (day - 1) % 30 + 1;
		}

		if (12 < month) {
			year += (month - 1) / 12;
			month = (month - 1) % 12 + 1;
		}

		System.out.println(String.format("%04d-%02d-%02d", year, month, day));

		sc.close();
	}

}

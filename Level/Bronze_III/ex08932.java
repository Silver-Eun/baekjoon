package Bronze_III;

import java.util.Scanner;

public class ex08932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			int sum = 0;
			String[] a = sc.nextLine().split(" ");

			int a1 = Integer.parseInt(a[0]);
			int a2 = Integer.parseInt(a[1]);
			int a3 = Integer.parseInt(a[2]);
			int a4 = Integer.parseInt(a[3]);
			int a5 = Integer.parseInt(a[4]);
			int a6 = Integer.parseInt(a[5]);
			int a7 = Integer.parseInt(a[6]);

			sum += (9.23076) * Math.pow((26.7 - a1), 1.835);
			sum += (1.84523) * Math.pow((a2 - 75), 1.348);
			sum += (56.0211) * Math.pow((a3 - 1.5), 1.05);
			sum += (4.99087) * Math.pow((42.5 - a4), 1.81);
			sum += (0.188807) * Math.pow((a5 - 210), 1.41);
			sum += (15.9803) * Math.pow((a6 - 3.8), 1.04);
			sum += (0.11193) * Math.pow((254 - a7), 1.88);

			System.out.println(sum);
		}

		sc.close();
	}

}

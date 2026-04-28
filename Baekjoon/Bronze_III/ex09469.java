package Bronze_III;

import java.util.Scanner;

public class ex09469 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		
		sc.nextLine();

		for (int i = 0; i < P; i++) {
			String[] a = sc.nextLine().split(" ");

			int N = Integer.parseInt(a[0]);
			double D = Double.parseDouble(a[1]);
			double A = Double.parseDouble(a[2]);
			double B = Double.parseDouble(a[3]);
			double F = Double.parseDouble(a[4]);

			System.out.println(N + " " + String.format("%.6f", ((D / (A + B)) * F)));
		}
		
		sc.close();
	}

}

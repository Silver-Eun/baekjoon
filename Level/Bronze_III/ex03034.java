package Bronze_III;

import java.util.Scanner;

public class ex03034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int N = Integer.parseInt(a[0]);
		int W = Integer.parseInt(a[1]);
		int H = Integer.parseInt(a[2]);

		for (int i = 0; i < N; i++) {
			int length = sc.nextInt();

			if (length * length <= W * W + H * H) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		
		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex03004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		
		sc.close();
		
		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				sum += 2;
			} else {
				sum += ((i / 2) + 1);
			}
		}
		System.out.println(sum);
	}

}

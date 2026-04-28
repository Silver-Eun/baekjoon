package Bronze_III;

import java.util.Scanner;

public class ex10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long C = sc.nextLong();
		Long D = sc.nextLong();

		Long E = Long.parseLong(Long.toString(A) + Long.toString(B));
		Long F = Long.parseLong(Long.toString(C) + Long.toString(D));

		System.out.println(E + F);

		sc.close();
	}

}

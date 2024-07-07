package Bronze_IV;

import java.util.Scanner;

public class ex23825 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();
		Long M = sc.nextLong();

		sc.close();

		Long a = N / 2;
		Long b = M / 2;

		System.out.println(Math.min(a, b));
	}

}

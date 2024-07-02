package Bronze_IV;

import java.util.Scanner;

public class ex15700 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();
		Long M = sc.nextLong();
		
		sc.close();

		Long a = (N * M) / 2;

		System.out.println(a);
	}

}

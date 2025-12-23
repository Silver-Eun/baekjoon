package Bronze_II;

import java.util.Scanner;

public class ex01212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String oct = sc.nextLine();

		String[] bin = { "000", "001", "010", "011", "100", "101", "110", "111" };

		if (oct.equals("0")) {
			System.out.println("0");
			return;
		}

		int first = oct.charAt(0) - '0';
		System.out.print(Integer.toBinaryString(first));

		for (int i = 1; i < oct.length(); i++) {
			int n = oct.charAt(i) - '0';
			System.out.print(bin[n]);
		}

		sc.close();
	}

}

package Bronze_II;

import java.util.Scanner;

public class ex01252 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] parts = input.split(" ");
		String A = parts[0];
		String B = parts[1];

		int i = A.length() - 1;
		int j = B.length() - 1;
		int carry = 0;

		String result = "";

		while (i >= 0 || j >= 0 || carry > 0) {
			int bitA = (i >= 0) ? A.charAt(i) - '0' : 0;
			int bitB = (j >= 0) ? B.charAt(j) - '0' : 0;

			int sum = bitA + bitB + carry;
			result = (sum % 2) + result;
			carry = sum / 2;

			i--;
			j--;
		}

		while (result.length() > 1 && result.charAt(0) == '0') {
			result = result.substring(1);
		}

		System.out.println(result);

		sc.close();
	}

}

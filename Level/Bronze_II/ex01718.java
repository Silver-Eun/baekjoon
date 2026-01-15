package Bronze_II;

import java.util.Scanner;

public class ex01718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();

		char[] arr = a.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ')
				continue;
			
			int plain = arr[i] - 'a';
			
			int key = b.charAt(i % b.length()) - 'a' + 1;

			int enc = (plain - key + 26) % 26;

			arr[i] = (char) (enc + 'a');
		}

		System.out.println(new String(arr));

		sc.close();
	}

}
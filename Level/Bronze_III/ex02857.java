package Bronze_III;

import java.util.Scanner;

public class ex02857 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = new String[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextLine();
		}

		boolean foundFBI = false;
		for (int i = 0; i < 5; i++) {
			if (a[i].contains("FBI")) {
				System.out.print((i + 1) + " ");
				foundFBI = true;
			}
		}
		if (!foundFBI) {
			System.out.println("HE GOT AWAY!");
		}
		
		sc.close();
	}

}

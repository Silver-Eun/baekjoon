package Bronze_III;

import java.util.Scanner;

public class ex14909 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		String[] tokens = line.split(" ");

		int count = 0;
		for (String token : tokens) {
			int num = Integer.parseInt(token);
			if (num > 0) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}

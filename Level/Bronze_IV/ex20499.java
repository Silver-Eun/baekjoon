package Bronze_IV;

import java.util.Scanner;

public class ex20499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String tkn[] = line.split("/");
		int K = Integer.valueOf(tkn[0]);
		int D = Integer.valueOf(tkn[1]);
		int A = Integer.valueOf(tkn[2]);

		sc.close();

		if ((K + A) < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}

}

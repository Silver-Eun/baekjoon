package Bronze_III;

import java.util.Scanner;

public class ex32399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int cnt = 0;
		switch (S) {
		case "(1)":
			cnt = 0;
			break;
		case "()1":
		case "1()":
		case "1)(":
		case ")(1":
			cnt = 1;
			break;
		case ")1(":
			cnt = 2;
			break;
		}

		System.out.println(cnt);

		sc.close();
	}

}

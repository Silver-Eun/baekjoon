package Bronze_III;

import java.util.Scanner;

public class ex32969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		String s = "social";
		String h = "history";
		String l = "language";
		String li = "literacy";
		String b = "bigdata";
		String p = "public";
		String so = "society";

		if (S.contains(s) || S.contains(h) || S.contains(l) || S.contains(li))
			System.out.println("digital humanities");
		else if (S.contains(b) || S.contains(p) || S.contains(so))
			System.out.println("public bigdata");

		sc.close();
	}

}

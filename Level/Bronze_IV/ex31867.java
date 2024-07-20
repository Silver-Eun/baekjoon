package Bronze_IV;

import java.util.Scanner;

public class ex31867 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String K = sc.nextLine();

		int odd = 0;
		int even = 0;

		for (int i = 0; i < K.length(); i++) {
			if ((K.charAt(i) % 2) == 0)
				even++;
			else
				odd++;
		}
		
		sc.close();

		if (even > odd)
			System.out.println(0);
		else if (even < odd)
			System.out.println(1);
		else if (even == odd)
			System.out.println(-1);
	}

}

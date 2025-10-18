package Bronze_III;

import java.util.Scanner;

public class ex31712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Cu = sc.nextInt();
		int Du = sc.nextInt();
		int Cd = sc.nextInt();
		int Dd = sc.nextInt();
		int Cp = sc.nextInt();
		int Dp = sc.nextInt();
		int H = sc.nextInt();

		int time = 0;

		while (true) {
			if (time % Cu == 0)
				H -= Du;
			if (time % Cd == 0)
				H -= Dd;
			if (time % Cp == 0)
				H -= Dp;

			if (H <= 0) {
				System.out.println(time);
				break;
			}
			time++;
		}

		sc.close();
	}

}

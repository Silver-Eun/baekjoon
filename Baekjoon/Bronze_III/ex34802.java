package Bronze_III;

import java.util.Scanner;

public class ex34802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String C = sc.nextLine();
		String S = sc.nextLine();
		int t = sc.nextInt();
		int k = sc.nextInt();

		String[] arr = C.split(":");

		int hhC = Integer.parseInt(arr[0]);
		int mmC = Integer.parseInt(arr[1]);
		int ssC = Integer.parseInt(arr[2]);

		int c = hhC * 3600 + mmC * 60 + ssC;

		String[] arrS = S.split(":");

		int hhS = Integer.parseInt(arrS[0]);
		int mmS = Integer.parseInt(arrS[1]);
		int ssS = Integer.parseInt(arrS[2]);

		int s = hhS * 3600 + mmS * 60 + ssS;

		int time = s - c;

		int runTime = t * (100 - k) / 100;

		if (runTime <= time) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

		sc.close();
	}

}

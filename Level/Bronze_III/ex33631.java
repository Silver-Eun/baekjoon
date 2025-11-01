package Bronze_III;

import java.util.Scanner;

public class ex33631 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Fs = sc.nextInt();
		int Cs = sc.nextInt();
		int Es = sc.nextInt();
		int Bs = sc.nextInt();

		int Fn = sc.nextInt();
		int Cn = sc.nextInt();
		int En = sc.nextInt();
		int Bn = sc.nextInt();

		int Q = sc.nextInt();

		int totalCookies = 0;

		for (int i = 0; i < Q; i++) {
			int type = sc.nextInt();
			int value = sc.nextInt();

			if (type == 1) {
				if (Fs >= Fn * value && Cs >= Cn * value && Es >= En * value && Bs >= Bn * value) {
					Fs -= Fn * value;
					Cs -= Cn * value;
					Es -= En * value;
					Bs -= Bn * value;
					totalCookies += value;
					System.out.println(totalCookies);
				} else {
					System.out.println("Hello, siumii");
				}
			} else if (type == 2) {
				Fs += value;
				System.out.println(Fs);
			} else if (type == 3) {
				Cs += value;
				System.out.println(Cs);
			} else if (type == 4) {
				Es += value;
				System.out.println(Es);
			} else if (type == 5) {
				Bs += value;
				System.out.println(Bs);
			}
		}

		sc.close();
	}

}

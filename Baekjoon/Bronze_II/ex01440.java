package Bronze_II;

import java.util.Scanner;

public class ex01440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String h = sc.nextLine();

		String[] H = h.split(":");

		int cnt = 0;

		int hh = Integer.parseInt(H[0]);
		int mm = Integer.parseInt(H[1]);
		int ss = Integer.parseInt(H[2]);

		int[][] a = { 
				{ hh, mm, ss },
				{ hh, ss, mm },
				{ mm, ss, hh },
				{ mm, hh, ss },
				{ ss, hh, mm },
				{ ss, mm, hh }, 
				};

		for (int i = 0; i < 6; i++) {
			if (a[i][0] <= 12 && 1 <= a[i][0])
				if (a[i][1] <= 59 && 0 <= a[i][1])
					if (a[i][2] <= 59 && 0 <= a[i][2])
						cnt++;
		}

		System.out.println(cnt);

		sc.close();
	}

}

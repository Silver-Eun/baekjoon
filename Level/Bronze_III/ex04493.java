package Bronze_III;

import java.util.Scanner;

public class ex04493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();


		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int p1 = 0;
			int p2 = 0;

			sc.nextLine();

			for (int j = 0; j < n; j++) {
				String[] a = sc.nextLine().split(" ");

				String player1 = a[0];
				String player2 = a[1];

				if (player1.equals("R")) {
					if (player2.equals("S")) {
						p1++;
					} else if (player2.equals("P")) {
						p2++;
					}
				} else if (player1.equals("P")) {
					if (player2.equals("R")) {
						p1++;
					} else if (player2.equals("S")) {
						p2++;
					}
				} else if (player1.equals("S")) {
					if (player2.equals("P")) {
						p1++;
					} else if (player2.equals("R")) {
						p2++;
					}
				}
			}
			
			if(p1 > p2) {
				System.out.println("Player1");
			} else if(p1 < p2) {
				System.out.println("Player2");
			} else {
				System.out.println("TIE");
			}
		}
		
		sc.close();
	}

}

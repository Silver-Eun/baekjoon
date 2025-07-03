package Bronze_III;

import java.util.Scanner;

public class ex10419 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int t = 0;
		
		for (int i = 0; i < T; i++) {
			int d = sc.nextInt();
			
			while(t*t+t<= d) {
				t++;
			}
			System.out.println(t-1);
		}
		sc.close();
	}

}

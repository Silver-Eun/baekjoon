package Bronze_III;

import java.util.Scanner;

public class ex01284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			while (true) {
			int sum = 1;
			
			String N = sc.nextLine();
			if(N.equals("0"))
				break;

			for (int i = 0; i < N.length(); i++) {
				if (N.charAt(i) == '1') {
					sum += 2;
				} else if (N.charAt(i) == '2') {
					sum += 3;
				} else if (N.charAt(i) == '0') {
					sum += 4;
				} else {
					sum += 3;
				}
			}

			sum += N.length() * 1;
			
			System.out.println(sum);
		}
		
		sc.close();
	}

}

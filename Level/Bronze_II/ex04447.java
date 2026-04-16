package Bronze_II;

import java.util.Scanner;

public class ex04447 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			
			int b = 0;
			int g = 0;
			
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'b' || s.charAt(j) == 'B')
					b++;
				else if(s.charAt(j) == 'g' || s.charAt(j) == 'G')
					g++;
			}
			
			if(b == g)
				System.out.println(s + " is NEUTRAL");
			else if(b < g)
				System.out.println(s + " is GOOD");
			else
				System.out.println(s + " is A BADDY");
		}

		sc.close();
	}

}

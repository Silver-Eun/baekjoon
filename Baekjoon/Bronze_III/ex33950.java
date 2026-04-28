package Bronze_III;

import java.util.Scanner;

public class ex33950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String s = sc.nextLine();
			
			s = s.replace("PO", "PHO");
			
			System.out.println(s);
		}
		
		sc.close();
	}

}

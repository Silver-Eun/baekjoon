package Bronze_IV;

import java.util.Scanner;

public class ex21964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		
		sc.close();
		
		for(int i = N-5; i < S.length(); i++) {
			System.out.print(S.charAt(i));
		}
	}

}

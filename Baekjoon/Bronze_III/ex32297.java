package Bronze_III;

import java.util.Scanner;

public class ex32297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		
		System.out.println(S.contains("gori") ? "YES" : "NO");		
		
		sc.close();
	}

}

package Bronze_II;

import java.util.Scanner;

public class ex01225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		
		String[] B = A.split(" ");
		String C = B[0];
		String D = B[1];
		
		long a = 0;
		long b = 0;

		for(int i = 0; i < C.length(); i++) {
			a += (C.charAt(i) - '0');
		}
		
		for(int i = 0; i < D.length(); i++) {
			b += (D.charAt(i) - '0');			
		}
		
		System.out.println(a*b);
		
		sc.close();
	}

}

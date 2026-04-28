package Bronze_III;

import java.util.Scanner;

public class ex20540 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		StringBuilder B = new StringBuilder("aaaa");
		
		if(A.charAt(0) == 'I') {
			B.setCharAt(0, 'E');
		} else {
			B.setCharAt(0, 'I');
		}
		if(A.charAt(1) == 'S') {
			B.setCharAt(1, 'N');
		} else {
			B.setCharAt(1, 'S');
		}
		if(A.charAt(2) == 'T') {
			B.setCharAt(2, 'F');
		} else {
			B.setCharAt(2, 'T');
		}
		if(A.charAt(3) == 'J') {
			B.setCharAt(3, 'P');
		} else {
			B.setCharAt(3, 'J');
		}
		
		System.out.println(B.toString());
		
		sc.close();
	}

}

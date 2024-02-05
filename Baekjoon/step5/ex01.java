package step5;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int a = sc.nextInt();
		
		System.out.println(S.charAt(a-1));
		
		sc.close();
	}

}

package step3;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int e = 0;
		for( int i = 1; i <= b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			e = e + c*d;
		}
		
		if(a == e) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		sc.close();
	}

}

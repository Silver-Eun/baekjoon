package step02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(0 <= A && A <= 100) {
			if ( 90 <= A && A <= 100) {
				System.out.println("A");
			}
			else if ( 80 <= A && A < 90) {
				System.out.println("B");
			}
			else if ( 70 <= A && A < 80) {
				System.out.println("C");
			}
			else if ( 60 <= A && A < 70) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
		
		sc.close();
	}

}

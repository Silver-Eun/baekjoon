package step3;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for(int i = a; i >= 1; i--) {
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = a; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
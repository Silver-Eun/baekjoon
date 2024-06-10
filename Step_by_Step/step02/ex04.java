package step02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		
		if (a != 0 && b != 0) {
			if(a > 0 && b > 0) {
				System.out.println(1);
			} else if(a < 0 && b > 0) {
				System.out.println(2);
			}  else if(a < 0 && b < 0) {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
		}
		
		sc.close();
	}

}

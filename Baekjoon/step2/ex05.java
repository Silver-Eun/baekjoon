package step2;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( 0 <= a && a <= 23 & 0 <= b && b <= 59) {
			if(a != 0 && b < 45) {
				b = b + 60 - 45;
				a = a - 1;
			} else if(a == 0 && b < 45) {
				b = b + 60 - 45;
				a = 23;
			}else {
				b -= 45;
			}
		}
		
		System.out.println(a + " " + b);
		
		sc.close();
	}

}

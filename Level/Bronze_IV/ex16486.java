package Bronze_IV;

import java.util.Scanner;

public class ex16486 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		sc.close();

		double a = 2 * d2 * 3.141592 + d1 * 2;
		
		System.out.println(a);
	}
}

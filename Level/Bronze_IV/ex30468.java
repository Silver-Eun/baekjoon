package Bronze_IV;

import java.util.Scanner;

public class ex30468 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int STR = sc.nextInt();
		int DEX = sc.nextInt();
		int INT = sc.nextInt();
		int LUK = sc.nextInt();
		int N = sc.nextInt();

		sc.close();

		int a = (4 * N) - (STR + DEX + INT + LUK);
		
		if(a >= 0)
			System.out.println(a);
		else
			System.out.println(0);
	}

}

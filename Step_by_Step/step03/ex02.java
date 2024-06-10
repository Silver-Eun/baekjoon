package step03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for(int i = a; i > 0; i--) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b+c);
		}
		
		sc.close();
	}

}

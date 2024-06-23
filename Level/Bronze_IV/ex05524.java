package Bronze_IV;

import java.util.Scanner;

public class ex05524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String SI = sc.next();
			SI = SI.toLowerCase();
			System.out.println(SI);
		}
		
		sc.close();
	}
}

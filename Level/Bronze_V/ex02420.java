package Bronze_V;

import java.util.Scanner;

public class ex02420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int a = N - M;
		
		System.out.println(Math.abs(a));
	}

}

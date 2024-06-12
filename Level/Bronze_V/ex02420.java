package Bronze_V;

import java.util.Scanner;

public class ex02420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long N = sc.nextLong();
		Long M = sc.nextLong();
		
		Long a = N - M;
		
		System.out.println(Math.abs(a));
		
		sc.close();
	}

}

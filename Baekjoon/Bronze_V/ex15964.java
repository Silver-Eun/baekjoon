package Bronze_V;

import java.util.Scanner;

public class ex15964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		Long B = sc.nextLong();

			System.out.println(alpha(A, B));
		
		sc.close();
		
	}

	public static Long alpha(Long a, Long b) {
		return (a + b) * (a - b);
	}
}

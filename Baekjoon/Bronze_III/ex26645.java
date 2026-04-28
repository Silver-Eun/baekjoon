package Bronze_III;

import java.util.Scanner;

public class ex26645 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N >= 200 && N <= 205) {
			System.out.println(1);
		} else if (N >= 206 && N <= 217) {
			System.out.println(2);
		} else if (N >= 218 && N <= 228) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
		sc.close();
	}

}

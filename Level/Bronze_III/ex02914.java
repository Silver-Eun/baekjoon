package Bronze_III;

import java.util.Scanner;

public class ex02914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");

		int A = Integer.parseInt(a[0]);
		int I = Integer.parseInt(a[1]);

		sc.close();
		
		int song = (A * (I - 1)) + 1;

		System.out.println(song);
	}

}

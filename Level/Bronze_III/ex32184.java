package Bronze_III;

import java.util.Scanner;

public class ex32184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int start = (A % 2 == 1) ? A : A - 1;
        int end = (B % 2 == 1) ? B : B - 1;

        System.out.println((end - start) / 2 + 1);
		
		sc.close();
	}

}

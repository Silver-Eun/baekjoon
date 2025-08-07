package Bronze_III;

import java.util.Scanner;

public class ex17174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int M = Integer.valueOf(B[1]);

		int sum = 0;
        int current = N;

        while (current >= M) {
            sum += current;
            current = current / M;
        }

        sum += current;

        System.out.println(sum);
        
        sc.close();
	}

}

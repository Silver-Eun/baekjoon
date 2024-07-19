package Bronze_IV;

import java.util.Scanner;

public class ex31428 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] A = sc.nextLine().split(" ");
		String B = sc.nextLine();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if(B.equals(A[i]))
				count++;
		}
		
		sc.close();
		
		System.out.println(count);
	}

}

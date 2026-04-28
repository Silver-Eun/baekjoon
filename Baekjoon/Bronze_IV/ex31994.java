package Bronze_IV;

import java.util.Scanner;

public class ex31994 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		String str = "";
		for (int i = 0; i < 7; i++) {
			String[] A = sc.nextLine().split(" ");
			String a = A[0];
			int b = Integer.parseInt(A[1]);
			
			if(max < b) {
				str = a;
				max = b;
			}
		}
		
		sc.close();
		
		System.out.println(str);
	}

}

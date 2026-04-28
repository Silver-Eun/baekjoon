package Bronze_III;

import java.util.Scanner;

public class ex17350 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a = 0;
		
		sc.nextLine();
		
		String[] A = new String[N];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextLine();
		}
		
		for(int i = 0; i < A.length; i++) {
			if(A[i].equals("anj")) {
				a++;
			}
		}
		
		if(a > 0) {
			System.out.println("构具;");
		} else {
			System.out.println("构具?");
		}
		
		sc.close();
	}

}

package Bronze_IV;

import java.util.Scanner;

public class ex13752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

}

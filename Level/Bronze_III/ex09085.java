package Bronze_III;

import java.util.Scanner;

public class ex09085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
				
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int N = sc.nextInt();
			
			sc.nextLine();
			
			String[] a = sc.nextLine().split(" ");
			
			for(int j = 0; j < N; j++) {
				sum += Integer.parseInt(a[j]);
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex09501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String[] a = sc.nextLine().split(" ");
			
			int N = Integer.parseInt(a[0]);
			double D = Double.parseDouble(a[1]);
			
			int cnt = 0;
			
			for(int j = 0;j < N; j++) {
				String[] b = sc.nextLine().split(" ");
				
				int S = Integer.parseInt(b[0]);
				int F = Integer.parseInt(b[1]);
				int R = Integer.parseInt(b[2]);
				
				if((D / S) * R <= F) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}

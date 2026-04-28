package Bronze_III;

import java.util.Scanner;

public class ex09325 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt();
						
			int n = sc.nextInt();
			
			sc.nextLine();
			
			for(int j = 0; j < n; j++) {
				if(n == 0)
					break;
				String[] a = sc.nextLine().split(" ");
				
				int q = Integer.parseInt(a[0]);
				int p = Integer.parseInt(a[1]);
				
				s += q*p;
			}
			
			System.out.println(s);
		}
		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex31831 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.nextLine();
		
		String A = sc.nextLine();
		String[] a = A.split(" ");
		
		int s = 0;
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			s += Integer.valueOf(a[i]);
			if(M <= s)
				cnt++;
			if(s < 0)
				s = 0;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}

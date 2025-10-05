package Bronze_III;

import java.util.Scanner;

public class ex30018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(a[i] - b[i] > 0)
				cnt += a[i] - b[i];
		}		
		
		System.out.println(cnt);
		
		sc.close();
	}

}

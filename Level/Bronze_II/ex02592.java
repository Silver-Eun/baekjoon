package Bronze_II;

import java.util.Scanner;

public class ex02592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] cnt = new int[100];
		
		int sum = 0;

		for(int i = 0; i < 10; i++) {
			int N = sc.nextInt();
			
			cnt[N/10]++;
			
			sum += N;
		}
		
		int max = 0;
		int mode = 0;

		for (int i = 0; i < 100; i++) {
		    if (cnt[i] > max) {
		        max = cnt[i];
		        mode = i * 10;
		    }
		}
		
		int avg = sum / 10;
		
		System.out.println(avg);
		System.out.println(mode);
		
		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex02506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int score = 0;
		int cnt = 0;
		
		String[] A = sc.nextLine().split(" ");

		sc.close();
		
		for (int i = 0; i < N; i++) {
			if(A[i].equals("1")) {
				cnt++;
				score += cnt;
			} else {
				cnt= 0;
			} 
		}
		
		System.out.println(score);
	}

}

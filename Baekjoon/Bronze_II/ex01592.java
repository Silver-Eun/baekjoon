package Bronze_II;

import java.util.Scanner;

public class ex01592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] count = new int[N];
		
		int pos = 0;
		int throwCnt = 0;
		
		count[0]++;
		
		while(true) {
			if(count[pos] == M)
				break;
			
			if(count[pos]%2 == 0) {
				pos = (pos - L + N) % N;
			} else {				
				pos = (pos + L) % N;
			}
			
			count[pos]++;
			throwCnt++;
		}
		
		System.out.println(throwCnt);
		
		sc.close();
	}

}

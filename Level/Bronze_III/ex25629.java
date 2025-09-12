package Bronze_III;

import java.util.Scanner;

public class ex25629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		sc.nextLine();
		
		String A = sc.nextLine();
		
		String[]B = A.split(" ");
		
		int[] arr = new int[T];
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < B.length; i++) {
			arr[i] = Integer.valueOf(B[i]);
			
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		
		if(Math.abs(even - odd) <= 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}

}

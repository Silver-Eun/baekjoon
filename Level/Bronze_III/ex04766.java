package Bronze_III;

import java.util.Scanner;

public class ex04766 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float N = sc.nextFloat();
		
		while(true) {
			float N1 = sc.nextFloat();
			
			if(N1 == 999) {
				break;
			}
			
			System.out.printf("%.2f ",N1 - N);
			N = N1;
		}
		
		sc.close();
	}

}

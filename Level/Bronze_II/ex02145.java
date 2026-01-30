package Bronze_II;

import java.util.Scanner;

public class ex02145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			String a = sc.next();
			
			if(a.equals("0"))
				break;
			
			int sum = 0;
			
			while(a.length() > 1) {
				for(int i = 0; i < a.length(); i++)
					sum += a.charAt(i) - '0';
			}
			
			System.out.println(sum);
			
		}
		
		sc.close();
		
	}

}

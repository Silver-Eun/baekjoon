package Bronze_IV;

import java.util.Scanner;

public class ex30501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < N; i++) {
			String a = sc.nextLine();
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) == 'S')
					System.out.println(a);
			}
		}
		
		sc.close();
	}

}

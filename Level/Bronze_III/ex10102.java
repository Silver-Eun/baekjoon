package Bronze_III;

import java.util.Scanner;

public class ex10102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int A = 0;
		int B = 0;
		
		sc.nextLine();
		
		String a = sc.nextLine();
		
		for(int i = 0; i < V; i++) {
			char c = a.charAt(i);
			
			if(c == 'A') {
				A++;
			} else if(c == 'B') {
				B++;
			}
		}
		
		if(A < B) {
			System.out.println("B");
		} else if(A > B) {
			System.out.println("A");
		}else {
			System.out.println("Tie");
		}
		
		sc.close();
	}

}

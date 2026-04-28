package Bronze_III;

import java.util.Scanner;

public class ex26040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		String[] b = B.split(" ");
		
		char[] arr = A.toCharArray();
		
		for(int i = 0; i < A.length(); i++) {
			for(int j = 0; j < b.length; j++) {
				if(arr[i] == b[j].charAt(0))
					arr[i] = Character.toLowerCase(arr[i]);
			}
		}
		
		System.out.println(new String(arr));
		
		sc.close();
	}

}

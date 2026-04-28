package Bronze_II;

import java.util.Scanner;

public class ex01919 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int[] arr = new int[27];
		
		int cnt = 0;
		
		for(int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) -'a']++;
		}

		for(int i = 0; i < b.length(); i++) {
			arr[b.charAt(i) -'a']--;
		}
		
		for(int i = 0; i < arr.length; i++) {
			cnt += Math.abs(arr[i]);
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}

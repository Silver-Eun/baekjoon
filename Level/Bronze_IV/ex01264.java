package Bronze_IV;

import java.util.Scanner;

public class ex01264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String a = sc.nextLine();
			int count = 0;
			if(a.equals("#")) {
				break;
			}
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) =='a' || a.charAt(i) =='e' || a.charAt(i) =='i'
						|| a.charAt(i) =='o' || a.charAt(i) =='u'
						|| a.charAt(i) =='A' || a.charAt(i) =='E' 
						|| a.charAt(i) =='I' || a.charAt(i) =='O'
						|| a.charAt(i) =='U') {
					count++;
				}
			}
			System.out.println(count);
		}
		
		sc.close();
	}

}

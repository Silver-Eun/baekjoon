package Bronze_III;

import java.util.Scanner;

public class ex05613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals("="))
				break;
			switch(str) {
			case "+" :
				n += sc.nextInt();
				break;
			case "-" :
				n -= sc.nextInt();
				break;
			case "/" :
				n /= sc.nextInt();
				break;
			case "*" :
				n *= sc.nextInt();
				break;
			}
		}
		
		System.out.println(n);
		
		sc.close();
	}

}

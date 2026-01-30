package Bronze_II;

import java.util.Scanner;

public class ex02153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		
		int b = 0;
		
		boolean prime = true;
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if ('a' <= c && c <= 'z')
				b += c - 'a' + 1;
			if ('A' <= c && c <= 'Z')
				b += c - 'A' + 27;
		}
		
		if(b == 1)
			prime = true;
		else {
			for(int i = 2; i <= Math.sqrt(b); i++) {
				if(b % i == 0)					{
					prime = false;
					break;
				}
			}
		}
		
		if (prime)
	    System.out.println("It is a prime word.");
	else
		System.out.println("It is not a prime word.");
		
		sc.close();
	}

}

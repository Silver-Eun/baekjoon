package step12;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
		
		sc.close();
	}

}

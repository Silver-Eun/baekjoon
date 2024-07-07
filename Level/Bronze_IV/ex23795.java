package Bronze_IV;

import java.util.Scanner;

public class ex23795 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int a = 0;
		while (a != -1) {
			a = sc.nextInt();
			if(a == -1)
				break;
			sum += a;
		}
		
		sc.close();

		System.out.println(sum);
	}

}

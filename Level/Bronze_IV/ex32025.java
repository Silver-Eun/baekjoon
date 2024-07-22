package Bronze_IV;

import java.util.Scanner;

public class ex32025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		
		sc.close();

		if (H <= W)
			System.out.println((H * 100) / 2);
		else
			System.out.println((W * 100) / 2);
	}

}

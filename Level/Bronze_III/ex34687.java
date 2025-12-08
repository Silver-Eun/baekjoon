package Bronze_III;

import java.util.Scanner;

public class ex34687 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float N = sc.nextFloat();
		float M = sc.nextFloat();

		if (M * 100 >= N * 81)
			System.out.println("yaho");
		else
			System.out.println("no");

		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex27960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Sa = sc.nextInt();
		int Sb = sc.nextInt();

		int Ca = Sa ^ Sb;
		
		System.out.println(Ca);
		
		sc.close();
	}

}

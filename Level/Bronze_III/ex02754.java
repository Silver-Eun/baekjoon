package Bronze_III;

import java.util.Scanner;

public class ex02754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		
		sc.close();

		if (A.equals("A+")) {
			System.out.println(4.3);
		} else if (A.equals("A0")) {
			System.out.println(4.0);
		} else if (A.equals("A-")) {
			System.out.println(3.7);
		} else if (A.equals("B+")) {
			System.out.println(3.3);
		} else if (A.equals("B0")) {
			System.out.println(3.0);
		} else if (A.equals("B-")) {
			System.out.println(2.7);
		} else if (A.equals("C+")) {
			System.out.println(2.3);
		} else if (A.equals("C0")) {
			System.out.println(2.0);
		} else if (A.equals("C-")) {
			System.out.println(1.7);
		} else if (A.equals("D+")) {
			System.out.println(1.3);
		} else if (A.equals("D0")) {
			System.out.println(1.0);
		} else if (A.equals("D-")) {
			System.out.println(0.7);
		} else if (A.equals("F")) {
			System.out.println(0.0);
		}
	}
}

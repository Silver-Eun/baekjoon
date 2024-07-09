package Bronze_IV;

import java.util.Scanner;

public class ex28290 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		
		sc.close();

		if (a.equals("fdsajkl;") || a.equals("jkl;fdsa")) {
			System.out.println("in-out");
		} else if (a.equals("asdf;lkj") || a.equals(";lkjasdf")) {
			System.out.println("out-in");
		} else if (a.equals("asdfjkl;")) {
			System.out.println("stairs");
		} else if (a.equals(";lkjfdsa")) {
			System.out.println("reverse");
		} else {
			System.out.println("molu");
		}
	}

}

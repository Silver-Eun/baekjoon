package Bronze_IV;

import java.util.Scanner;

public class ex02083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// next()는 개행문자를 무시, nextLine()은 한줄 단위
			String name = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();

			if (name.equals("#") && age == 0 && weight == 0) {
				break;
			}

			if (age > 17 || weight >= 80) {
				System.out.println(name + " Senior");
			} else {
				System.out.println(name + " Junior");
			}
		}
		
		sc.close();
	}

}

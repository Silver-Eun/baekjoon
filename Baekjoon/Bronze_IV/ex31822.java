package Bronze_IV;

import java.util.Scanner;

public class ex31822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		String a = sc.nextLine();
		int N = Integer.parseInt(sc.nextLine());
		String[] arr = new String[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
			if ((a.substring(0, 5)).equals(arr[i].substring(0, 5)))
				count++;
		}

		sc.close();

		System.out.println(count);
	}

}

package Bronze_IV;

import java.util.Scanner;

public class ex30045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[N];

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < (arr[i].length() - 1); j++) {
				if ((arr[i].charAt(j) == '0' && arr[i].charAt(j + 1) == '1')
						|| (arr[i].charAt(j) == 'O' && arr[i].charAt(j + 1) == 'I')) {
					cnt++;					
					break;
				}
			}
		}

		sc.close();

		System.out.println(cnt);
	}

}

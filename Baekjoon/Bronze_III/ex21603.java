package Bronze_III;

import java.util.ArrayList;
import java.util.Scanner;

public class ex21603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] B = A.split(" ");

		int N = Integer.valueOf(B[0]);
		int K = Integer.valueOf(B[1]);

		int lastK = K % 10;
		int last2K = (2 * K) % 10;

		ArrayList<Integer> list = new ArrayList<>();

		for (int x = 1; x <= N; x++) {
			int last = x % 10;
			if (last != lastK && last != last2K) {
				list.add(x);
			}
		}

		System.out.println(list.size());
		for (int num : list) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}

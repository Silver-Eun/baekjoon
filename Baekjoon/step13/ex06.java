package step13;

import java.util.Arrays;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();

		sc.close();

		String str = Long.toString(N);

		char[] arr = str.toCharArray();

		// 오름차순으로 정렬
		Arrays.sort(arr);

		// 역순으로 정렬
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
		str = sb.toString();

		N = Long.parseLong(str);

		System.out.println(N);
	}

}

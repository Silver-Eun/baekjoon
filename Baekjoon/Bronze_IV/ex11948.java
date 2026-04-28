package Bronze_IV;

import java.util.Arrays;
import java.util.Scanner;

public class ex11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		
		sc.close();

		int[] arr1 = { A, B, C, D };
		int[] arr2 = { E, F };
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(arr1[1] + arr1[2] + arr1[3] + arr2[1]);
	}

}

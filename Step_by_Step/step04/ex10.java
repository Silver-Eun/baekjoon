package step04;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Float[] arr = new Float[N];
		
		float max = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
		}

		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		
		System.out.println(avg/N);
		
		sc.close();
	}

}

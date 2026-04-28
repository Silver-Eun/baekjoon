package Bronze_IV;

import java.util.Arrays;
import java.util.Scanner;

public class ex25704 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int coupon = sc.nextInt();
		int price = sc.nextInt();
		sc.close();

		int[] resultList = { 50000, 50000, 50000, price };

		if (20 <= coupon) {
			resultList[0] = price - 2000;
			resultList[1] = price - (price / 10);
			resultList[2] = price - (price / 4);
		} else if (15 <= coupon) {
			resultList[0] = price - 2000;
			resultList[1] = price - (price / 10);
		} else if (10 <= coupon) {
			resultList[0] = price - 500;
			resultList[1] = price - (price / 10);
		} else if (5 <= coupon) {
			resultList[0] = price - 500;
		} else {

		}

		Arrays.sort(resultList);

		System.out.println(resultList[0] < 0 ? 0 : resultList[0]);
	}

}

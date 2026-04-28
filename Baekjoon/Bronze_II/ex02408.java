package Bronze_II;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ex02408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<BigInteger> numbers = new ArrayList<>();
		ArrayList<Character> ops = new ArrayList<>();

		numbers.add(sc.nextBigInteger());

		for (int i = 0; i < N - 1; i++) {
			char op = sc.next().charAt(0);
			BigInteger nextNum = sc.nextBigInteger();

			if (op == '*' || op == '/') {
				BigInteger prevNum = numbers.remove(numbers.size() - 1);

				if (op == '*') {
					numbers.add(prevNum.multiply(nextNum));
				} else {
					BigInteger res = prevNum.divide(nextNum);

					if (!prevNum.remainder(nextNum).equals(BigInteger.ZERO) && prevNum.signum() != nextNum.signum()) {
						res = res.subtract(BigInteger.ONE);
					}
					numbers.add(res);
				}
			} else {
				numbers.add(nextNum);
				ops.add(op);
			}
		}
		BigInteger result = numbers.get(0);
		for (int i = 0; i < ops.size(); i++) {
			if (ops.get(i) == '+') {
				result = result.add(numbers.get(i + 1));
			} else {
				result = result.subtract(numbers.get(i + 1));
			}
		}

		System.out.println(result);
		
		sc.close();
	}
}
package Bronze_III;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex25756 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String A = sc.nextLine();
		String[] B = A.split(" ");
		double[] C = new double[B.length];
		double V = 0;

		DecimalFormat df = new DecimalFormat("0.0######"); 
		
		for (int i = 0; i < N; i++) {
			V = 1 - (1 - V) * (1 - Double.valueOf(B[i]) / 100);
			C[i] = V;
		}

		for (int i = 0; i < C.length; i++) {
			System.out.println(df.format(C[i] * 100));
		}
		
		sc.close();
	}

}

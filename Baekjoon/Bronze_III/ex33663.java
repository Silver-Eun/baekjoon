package Bronze_III;

import java.util.Scanner;

public class ex33663 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Hlo = sc.nextInt();
		int Hhi = sc.nextInt();
		int Slo = sc.nextInt();
		int Shi = sc.nextInt();
		int Vlo = sc.nextInt();
		int Vhi = sc.nextInt();

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		double M = Math.max(R, Math.max(G, B));
		double m = Math.min(R, Math.min(G, B));

		double V = M;
		double S = (V == 0) ? 0 : 255 * (V - m) / V;

		double H;

		if (M == R) {
			H = 60.0 * (G - B) / (V - m);
		} else if (M == G) {
			H = 120.0 + 60.0 * (B - R) / (V - m);
		} else {
			H = 240.0 + 60.0 * (R - G) / (V - m);
		}

		if (H < 0)
			H += 360;

		if (Hlo <= H && H <= Hhi && Slo <= S && S <= Shi && Vlo <= V && V <= Vhi) {
			System.out.println("Lumi will like it.");
		} else {
			System.out.println("Lumi will not like it.");
		}
	}
}

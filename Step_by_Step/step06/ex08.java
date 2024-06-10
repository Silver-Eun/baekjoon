package step06;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] frgs) {
		Scanner sc = new Scanner(System.in);
		
		// 학점*평점
		double sum = 0;
		// 총 학점
		double sumF = 0;

		for (int i = 0; i < 20; i++) {
			// 과목명
//			String s = sc.next();
			// 학점
			double f = sc.nextDouble();
			// 평점
			String t = sc.next();

			if (t.equals("A+")){
                sum += f * 4.5;
                sumF += f;
            } else if (t.equals("A0")) {
                sum += f * 4.0;
                sumF += f;
            }else if (t.equals("B+")) {
                sum += f * 3.5;
                sumF += f;
            }else if (t.equals("B0")) {
                sum += f * 3.0;
                sumF += f;
            }else if (t.equals("C+")) {
                sum += f * 2.5;
                sumF += f;
            }else if (t.equals("C0")) {
                sum += f * 2.0;
                sumF += f;
            }else if (t.equals("D+")) {
                sum += f * 1.5;
                sumF += f;
            }else if (t.equals("D0")) {
                sum += f * 1.0;
                sumF += f;
            }else if (t.equals("F")) {
                sum += f * 0.0;
                sumF += f;
				}
				
			}

		System.out.printf("%.6f", sum / sumF);

		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex25285 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String A = sc.nextLine();
			String[] B = A.split(" ");
			
			int h = Integer.valueOf(B[0]);
			int w = Integer.valueOf(B[1]);
			
			double bmi = w / ((h / 100.0) * (h / 100.0));

			int grade = 0;
			
			if (h < 140.1) {
			    grade = 6;
			} else if (h < 146) {
			    grade = 5;
			} else if (h < 159) {
			    grade = 4;
			} else if (h < 161) {
			    grade = (bmi >= 16 && bmi < 35) ? 3 : 4;
			} else if (h < 204) {
			    if (bmi < 16 || bmi >= 35) grade = 4;
			    else if (bmi >= 20 && bmi < 25) grade = 1;
			    else if ((bmi >= 18.5 && bmi < 20) || (bmi >= 25 && bmi < 30)) grade = 2;
			    else grade = 3;
			} else {
			    grade = 4;
			}
			
			System.out.println(grade);
		}
		
		sc.close();
	}

}

package Bronze_III;

import java.util.Scanner;

public class ex02765 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 1;
		double pi = 3.1415927;
		while (true) {
			String[] A = sc.nextLine().split(" ");
			float d = Float.parseFloat(A[0]);
			int c = Integer.parseInt(A[1]);
			float t = Float.parseFloat(A[2]);
			
			if(c == 0)
				break;

			double distance = (d * pi * c) / (5280 * 12);
			double mph = (distance * 60 * 60) / t;

			 System.out.println("Trip #" + N + ": " + String.format("%.2f", distance) +
	                    " " + String.format("%.2f", mph));
	         N++;
		}
		
		sc.close();
	}

}

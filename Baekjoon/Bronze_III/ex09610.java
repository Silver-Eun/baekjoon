package Bronze_III;

import java.util.Scanner;

public class ex09610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int axis = 0;
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String[] a = sc.nextLine().split(" ");
			
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			
			if(x == 0 || y == 0) {
				axis++;
			} else if(0 < x && 0 < y) {
				q1++;
			} else if(x < 0 && 0 < y) {
				q2++;
			} else if(x < 0 && y < 0) {
				q3++;
			} else if(0 < x && y < 0) {
				q4++;
			}
		}
		
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
		
		sc.close();
	}

}

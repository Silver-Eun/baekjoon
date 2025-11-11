package Bronze_III;

import java.util.Scanner;

public class ex34001 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int L = sc.nextInt();

	        int[][] arcane = {
	            {200, 210, 220},
	            {210, 220, 225},
	            {220, 225, 230},
	            {225, 230, 235},
	            {230, 235, 245},
	            {235, 245, 250}
	        };

	        int[][] grandis = {
	            {260, 265, 270},
	            {265, 270, 275},
	            {270, 275, 280},
	            {275, 280, 285},
	            {280, 285, 290},
	            {285, 290, 295},
	            {290, 295, 300}
	        };

	        for (int[] area : arcane) {
	            int q = area[0], d1 = area[1], d2 = area[2];
	            System.out.print(monsterCount(L, q, d1, d2) + " ");
	        }
	        System.out.println();

	        for (int[] area : grandis) {
	            int q = area[0], d1 = area[1], d2 = area[2];
	            System.out.print(monsterCount(L, q, d1, d2) + " ");
	        }
	        System.out.println();

	        sc.close();
	    }

	    static int monsterCount(int L, int q, int d1, int d2) {
	        if (L < q) return 0;
	        else if (L < d1) return 500;
	        else if (L < d2) return 300;
	        else return 100;
	    }
	}

package Bronze_III;

import java.util.Scanner;

public class ex02476 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int max = 0;

        for (int i = 0; i < N; i++) {
            String[] A = sc.nextLine().split(" ");
            int a = Integer.parseInt(A[0]);
            int b = Integer.parseInt(A[1]);
            int c = Integer.parseInt(A[2]);

            int prize = 0;
            if (a == b && b == c) {
                prize = 10000 + a * 1000;
            } else if (a == b || b == c || a == c) {
                if (a == b || a == c) {
                    prize = 1000 + a * 100;
                } else {
                    prize = 1000 + b * 100;
                }
            } else {
                prize = Math.max(a, Math.max(b, c)) * 100;
            }

            if (prize > max) {
                max = prize;
            }
        }

        sc.close();

        System.out.println(max);
    }
}

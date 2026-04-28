package Bronze_III;

import java.util.Scanner;

public class ex27465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(4);
        } else if (N % 2 == 0) {
            System.out.println(N);
        } else {
            System.out.println(N + 1);
        }

        sc.close();
    }
}

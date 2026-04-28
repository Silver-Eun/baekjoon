package Bronze_III;

import java.util.Scanner;

public class ex30032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (D == 1) {
                    if (c == 'p') result.append('b');
                    else if (c == 'q') result.append('d');
                    else if (c == 'b') result.append('p');
                    else if (c == 'd') result.append('q');
                    else result.append(c);
                } else if (D == 2) {
                    if (c == 'p') result.append('q');
                    else if (c == 'q') result.append('p');
                    else if (c == 'b') result.append('d');
                    else if (c == 'd') result.append('b');
                    else result.append(c);
                } 
            }

            System.out.println(result);
        }

        sc.close();
    }
}

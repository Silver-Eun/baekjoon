package Bronze_III;

import java.util.Scanner;

public class ex10205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < k; i++) {
            int h = sc.nextInt();
            sc.nextLine();
            String actions = sc.nextLine();

            for (int j = 0; j < actions.length(); j++) {
                char action = actions.charAt(j);
                if (action == 'c') {
                    h += 1;
                } else if (action == 'b') {
                    h -= 1;
                }
            }

            System.out.println("Data Set " + (i + 1) + ":");
            System.out.println(h);
            System.out.println();
        }

        sc.close();
    }
}
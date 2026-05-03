package Lv0;

import java.util.Scanner;

public class ex250129 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String route = sc.nextLine();

        int east = 0;
        int north = 0;

        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }

        System.out.println(east + ", " + north);
    }
}
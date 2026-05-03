package Lv0;

import java.util.Scanner;

public class ex340200 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nickname = sc.next();

        ex340200 s = new ex340200();
        String result = s.solution(nickname);

        System.out.println(result);

        sc.close();
    }

    public String solution(String nickname) {
        String answer = "";
        for (int i = 0; i < nickname.length(); i++) {
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4) {
            answer += "o";
        }
        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
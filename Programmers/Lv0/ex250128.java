package Lv0;

import java.util.Scanner;

public class ex250128 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];
        int[] our_score = new int[n];
        int[] score_list = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            our_score[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            score_list[i] = sc.nextInt();
        }

        ex250128 s = new ex250128();
        String[] result = s.solution(numbers, our_score, score_list);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
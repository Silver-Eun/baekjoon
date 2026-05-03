package Lv0;

public class ex340203 {

    public static void main(String[] args) {
        ex340203 s = new ex340203();

        String[] cpr = {"call", "respiration", "repeat", "check", "pressure"};

        int[] result = s.solution(cpr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i < cpr.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }

}
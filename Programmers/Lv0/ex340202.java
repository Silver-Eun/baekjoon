package Lv0;

public class ex340202 {

    public static void main(String[] args) {
        ex340202 s = new ex340202();

        int storage = 1000;
        int usage = 100;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};

        int result = s.solution(storage, usage, change);
        System.out.println(result);
    }

    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;

        for (int i = 0; i < change.length; i++) {
            usage = usage + (usage * change[i] / 100);
            total_usage += usage;

            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }
}
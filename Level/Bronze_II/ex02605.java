package Bronze_II;

import java.util.Scanner;
import java.util.ArrayList;

public class ex02605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			int move = sc.nextInt();
			list.add(list.size() - move, i + 1);
		}

		for (int student : list) {
			System.out.print(student + " ");
		}

		sc.close();
	}

}

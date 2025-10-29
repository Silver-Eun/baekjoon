package Bronze_III;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex32978 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String[] all = sc.nextLine().split(" ");
		String[] used = sc.nextLine().split(" ");

		Set<String> usedSet = new HashSet<>(Arrays.asList(used));

		for (String ingredient : all) {
			if (!usedSet.contains(ingredient)) {
				System.out.println(ingredient);
				break;
			}
		}

		sc.close();
	}
}

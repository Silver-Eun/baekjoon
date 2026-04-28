package Bronze_II;

import java.util.Scanner;

public class ex05211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String music = sc.nextLine();

		String[] bars = music.split("\\|");

		int cMajor = 0;
		int aMinor = 0;

		for (String bar : bars) {
			char first = bar.charAt(0);

			if (first == 'C' || first == 'F' || first == 'G')
				cMajor++;

			if (first == 'A' || first == 'D' || first == 'E')
				aMinor++;
		}

		if (cMajor > aMinor) {
			System.out.println("C-major");
		} else if (aMinor > cMajor) {
			System.out.println("A-minor");
		} else {
			char last = music.charAt(music.length() - 1);

			if (last == 'C' || last == 'F' || last == 'G')
				System.out.println("C-major");
			else
				System.out.println("A-minor");
		}
		
		sc.close();
	}
}

package Bronze_III;

import java.util.Scanner;

public class ex04435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String[] a = sc.nextLine().split(" ");
			String[] b = sc.nextLine().split(" ");

			int hobit = Integer.parseInt(a[0]);
			int human = Integer.parseInt(a[1]);
			int elf = Integer.parseInt(a[2]);
			int dewarf = Integer.parseInt(a[3]);
			int eagle = Integer.parseInt(a[4]);
			int wizard = Integer.parseInt(a[5]);

			int oak = Integer.parseInt(b[0]);
			int human1 = Integer.parseInt(b[1]);
			int wolf = Integer.parseInt(b[2]);
			int goblin = Integer.parseInt(b[3]);
			int uruk = Integer.parseInt(b[4]);
			int troll = Integer.parseInt(b[5]);
			int wizard1 = Integer.parseInt(b[6]);

			int gandalf = hobit + 2 * human + 3 * elf + 3 * dewarf + 4 * eagle + 10 * wizard;
			int sauron = oak + 2 * human1 + 2 * wolf + 2 * goblin + 3 * uruk + 5 * troll + 10 * wizard1;

			if (gandalf > sauron) {
				System.out.println("Battle " + (i + 1) + ": Good triumphs over Evil");
			} else if (gandalf < sauron) {
				System.out.println("Battle " + (i + 1) + ": Evil eradicates all trace of Good");
			} else if (gandalf == sauron) {
				System.out.println("Battle " + (i + 1) + ": No victor on this battle field");
			}
		}
		
		sc.close();
	}

}

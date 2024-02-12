package step6;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			// 만약 ch 가 c 라면?
			if (ch == 'c') {
				if (i < str.length() - 1) {
					// 만약 ch 다음 문자가 '=' 이라면?
					if (str.charAt(i + 1) == '=') {
						// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
						i++;
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			// dz= 일 경우
			else if (ch == 'd') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'z') {
						if (i < str.length() - 2) {
							if (str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}
					// d- 일 경우
					else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			// lj 일 경우
			else if (ch == 'l') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			// nj 일 경우
			else if (ch == 'n') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			// s= 일 경우
			else if (ch == 's') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			// z= 일 경우
			else if (ch == 'z') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			count++;
		}

		System.out.println(count);

		sc.close();
	}

}

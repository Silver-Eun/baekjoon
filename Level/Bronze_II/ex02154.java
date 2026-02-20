package Bronze_II;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex02154 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			sb.append(i);
		}

		String full = sb.toString();
		int answer = full.indexOf(String.valueOf(N)) + 1;

		System.out.println(answer);
	}

}

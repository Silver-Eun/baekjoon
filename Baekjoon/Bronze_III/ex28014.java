package Bronze_III;

import java.io.*;
import java.util.*;

public class ex28014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] H = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			H[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 1;

		for (int i = 0; i < N - 1; i++) {
			if (H[i] <= H[i + 1]) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}

package step14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ex02 {

	public static void main(String[] args) throws Exception {
		// 입력을 받기 위한 BufferedReader 객체를 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader를 통해 한 줄씩 입력을 받고
		// StringTokenizer를 이용하여 공백을 기준으로 문자열을 분리
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 문자열을 저장하기 위한 HashSet 객체를 생성
		HashSet<String> set = new HashSet<>();

		int count = 0;

		// n번 반복하면서 BufferedReader를 통해 입력된 문자열을 HashSet에 추가
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		// BufferedReader를 통해 한 줄씩 입력된 문자열을 읽어옴
		for (int i = 0; i < m; i++) {
			String str = br.readLine();

			if (set.contains(str))
				count++;
		}

		System.out.println(count);
	}

}

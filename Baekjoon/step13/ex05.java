package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex05 {

	public static void main(String[] args) throws IOException {
		// 표준 입력(System.in)을 사용하여 BufferedReader 객체를 생성
		// 입력을 버퍼링하여 효율적으로 처리할 수 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력 결과를 담을 StringBuilder 객체, 문자열을 효율적으로 처리할 수 있음
		StringBuilder sb = new StringBuilder();

		// BufferedReader를 사용하여 한 줄을 읽고, 이를 정수형으로 변환하여 변수 N에 저장
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		// 정렬된 배열의 각 요소를 StringBuilder에 추가
		for (int i = 0; i < N; i++) {
			sb.append(arr[i]).append('\n');
		}

		// StringBuilder에 저장된 결과를 출력
		// toString 메서드를 호출하여 문자열로 변환된 후, 표준 출력(System.out)에 출력
		System.out.println(sb);
	}

}

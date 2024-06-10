package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex06 {

	public static void main(String[] args)throws IOException {
		// 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//  StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있음
		StringTokenizer st;
		
		// readLine()시 리턴값을 String으로 고정되기에 다른타입으로 입력을 받을려면 형변환을 꼭 해주어야 함
		// 예외처리를 꼭 해주어야 함. readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만
		// 대개 throws IOException을 통하여 작업
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			// bw.write에는 자동개행기능이 없어 \n를 통해 따로 처리해주어야 함
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		
		// BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close()를 반드시 호출해 주어 뒤처리를 해주어야함 
		bw.close();
	}

}

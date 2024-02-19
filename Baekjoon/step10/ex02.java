package step10;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 현 위치
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// 정사각형
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// x축 최소거리
		int x_min = Math.min(x, w-x);
		// y축 최소거리
		int y_min = Math.min(y, h-y);
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
		
		sc.close();
	}

}

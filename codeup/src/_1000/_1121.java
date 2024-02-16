package _1000;

import java.util.Scanner;

/**
 * 정수 계산에서 나머지를 구하시오.

예를 들어

7 / 5 의 나머지는 2입니다.
 */
public class _1121 {

	public static void main(String[] args) {
		
		//입력
		//두 정수 a, b를 입력받는다.
		//a는 피제수, b는 제수를 나타낸다.
		//예) 7 5 가 입력되었다면  ====>   7  /  5 를 뜻함
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//출력
		//나머지를 출력한다.
		
		System.out.println(a %= b);
		sc.close();
	}
}

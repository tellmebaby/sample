package _1000;

import java.util.Scanner;

/**
 * 정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647
 */
public class _1046 {

	public static void main(String[] args) {
		//입력
		//정수 3개가 공백을 두고 입력된다.
		//단, -2147483648 ~ +2147483647
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float d = ((a+b+c)/3.0F);
		System.out.println(a+b+c);
		System.out.printf("%.1f",d); // %d <-정수일때 , %,1.. <-실수의 자릿수로 나타낼때
		sc.close();
	}
}

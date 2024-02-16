package _1000;

import java.util.Scanner;

/**
 * 두 정수 중 큰 정수를 출력한다.
 * 입력
 * 두 정수가 입력된다.
 * 입력 예시
 * 2 7
 * 출력
 * 두 정수 중 큰 정수를 출력한다.
 * 출력 예시
 * 7
 */
public class _1149 {

	public static void main(String[] args) {
		
		// 두 정수가 입력된다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		//출력
		int c ;
		
		boolean value = ((c=a)>b) || ((c=b)>a);

		/**
		if(a>b) {
			c = a;
		}else {
			c = b;
		}
		*/
		System.out.println(c);
		sc.close();
	}
}

package _1000;
/**
어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.

여기서 입력되는 n은 반드시 홀수이다.
*/

import java.util.Scanner;


public class _1358 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int check1 = 0;
		for (int i = 0; i < n; i++) {
			if(i % 2 == 1) {
				check1 += 1;
			}
		}
		
		int check2 = check1 ;
		int star = 1;
		
		if( n % 2 == 1 || n > 0 ) {
			for (int i = 0; i < n-check1; i++) {
				for (int j = 0; j < check2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < star; j++) {
					System.out.print("*");
				}
				star += 2;
				check2 -= 1;
				System.out.println();
			}
		}else {
			System.out.println("홀수인 양수가 필요합니다.");
		}
	}
}

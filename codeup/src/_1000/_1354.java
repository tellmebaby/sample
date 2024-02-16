package _1000;

/**
			길이 n이 입력되면 역삼각형을 출력한다.
			
			예)
			
			n이 5이면
			
			*****
			****
			***
			**
			*
 */

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int ln = sc.nextInt();
		
		
		// 역삼각 조건
		int minus = ln;
		// 출력
		if(ln > 0 ) {
			for (int i = 0; i < ln; i++) {
				for (int j = minus; j > 0; j--) {
					System.out.print("*");
				}
				minus -= 1;
				System.out.println();
			}
		}else {
			System.out.println("0보다 커야합니다.");
		}
		
		
	}

}

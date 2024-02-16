package _1000;
/**
 * 	길이 n이 입력되면 길이가 n인 사각형을 출력하시오.
	단, 사각형은 * 모양으로 채운다.
 */

import java.util.Scanner;

public class _1352 {

	public static void main(String[] args) {
		
		// 입력 : 사각형의 길이 n이 입력된다.
		Scanner sc = new Scanner(System.in);
		int ln = sc.nextInt();
		
		for (int i = 0; i < ln; i++) {
			for (int j = 0; j < ln; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

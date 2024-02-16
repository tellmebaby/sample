package _1000;

/**
 * 두 정수를 입력받아 아래와 같이 출력하시오.
 * 
 * 예)  3 2
 * 
 * 3+2=5
 * 3-2=1
 * 3*2=6
 * 3/2=1
 */

import java.util.Scanner;

public class _1116 {
	public static void main(String[] args) {
		
		// 1. 두 정수 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int num1 = sc.nextInt();
		
		System.out.print("");
		int num2 = sc.nextInt();
		
		// 2. 덧셈/뺄셈/곱셈/나눗셈 결과 구하기
		// 3. 출력 양식에 맞게 출력
		
		int r1 = num1 + num2 ;
		int r2 = num1 - num2 ;
		int r3 = num1 * num2 ;
		int r4 = num1 / num2 ;
		
		System.out.println(num1 + "+" + num2 + "=" + r1);
		System.out.println(num1 + "-" + num2 + "=" + r2);
		System.out.println(num1 + "*" + num2 + "=" + r3);
		System.out.println(num1 + "/" + num2 + "=" + r4);
		
		sc.close();
		
	}
}

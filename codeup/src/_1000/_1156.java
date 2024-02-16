package _1000;

import java.util.Scanner;

public class _1156 {

	public static void main(String[] args) {
		// 자연수 하나가 입력된다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//출력 : 홀수이면 odd를 출력, 짝수이면 even을 출력하시오.
		
		if ( a % 2 == 1) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
	}
	
}

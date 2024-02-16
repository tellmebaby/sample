package _1000;

import java.util.Scanner;

public class _1159 {

	public static void main(String[] args) {
		
		// 슬기가 던진 공의 위치가 입력된다.(정수)
		
		// 출력 : 1. 공의 위치가 50m~70m이면 슬기가 이김.
		// 또는 2. 공의 위치가 6의 배수이면 슬기가 이김. 
		// 승리 조건을 잘 보고 슬기가 이기는 조건이면 win, 그외에는 lose를 출력하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if ((a >= 50 && a <=70)||((a%6 == 0))) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		sc.close();
	}
}

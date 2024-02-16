package _1000;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		//슬기가 던진 공의 위치가 입력으로 주어진다.(실수)
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();
		
		// 출력 : 50이상 60이하이면 win을 출력, 그 외에는 lose를 출력하시오.
		
		if (a >= 50.0 && a <= 60.0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}

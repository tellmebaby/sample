package _1000;

import java.util.Scanner;

public class _1158 {

	public static void main(String[] args) {
		//문제 : 공의 위치 n이 정수로 입력됨.(이번에는 정수로 입력됨)
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//출력 : 30 < <40
		
		if (( a >= 30 && a <= 40)||( a >=60 && a <= 70) ) {
			System.out.println("win");
		}else{
			System.out.println("lose");
		}
	}
}

package _1000;

import java.util.Scanner;

public class _1155 {

	public static void main(String[] args) {
		
		//자연수가 입력된다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if ( a % 7 == 0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}
	}
}

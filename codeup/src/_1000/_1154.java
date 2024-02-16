package _1000;

import java.util.Scanner;

/** 
 * 정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.
 */
public class _1154 {

	public static void main(String[] args) {
		//입력 : 두 정수가 입력된다.
		
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				//출력 : 큰수 - 작은 수의 값이 출력된다.

				if ( a > b ) {
					System.out.println(a-b);
				}else {
					System.out.println(b-a);
				}
					
				
				sc.close();
				
	}
		
}

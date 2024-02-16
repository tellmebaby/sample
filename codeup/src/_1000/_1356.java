package _1000;

/**
	길이 n이 입력되면 다음과 같은 사각형을 출력한다.
	
	예)
	
	n이 5일때
	
	*****
	*   *
	*   *
	*   *
	*****
 */

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ln = sc.nextInt();
		
		for (int i = 0; i < ln; i++) {
			if(i == 0 || i == ln-1) {
				for (int j = 0; j < ln; j++) {
					System.out.print("*");
				}
			}else {
				for (int j = 0; j < ln; j++) {
					if(j == 0 || j == ln-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}

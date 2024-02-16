package _1000;

/**
		길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
		
		예)
		
		n이 5이면
		
 *****
 ****
 ***
 **
 *
 */
import java.util.Scanner;

public class _1355 {

	public static void main(String[] args) {
		// 입력 : 3
		
		
		Scanner sc = new Scanner(System.in);
		
		int ln = sc.nextInt();
		int check = 0;
		int check2 = ln;
		
		
		if(ln > 0) {
			for (int i = 0; i < ln; i++) {
				for (int j = 0; j < check; j++) {
					System.out.print(" ");
				}
				for (int j = check2; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
				check += 1;
				check2 -= 1;
				
			}
		}else {
			System.out.println("양수로 입력해야 합니다.");
		}
		
	}
}

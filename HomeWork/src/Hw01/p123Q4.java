package Hw01;


public class p123Q4 {

	public static void main(String[] args) {
		int n = 7;
		
		int check1 = 0;
		for (int i = 0; i < n; i++) {
			if(i % 2 == 1) {
				check1 += 1;
			}
		}
		
		int check2 = check1 ;
		int star = 1;
		
		if( n % 2 == 1 || n > 0 ) {
			for (int i = 0; i < n-check1; i++) {
				for (int j = 0; j < check2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < star; j++) {
					System.out.print("*");
				}
				star += 2;
				check2 -= 1;
				System.out.println();
			}
		}else {
			System.out.println("홀수인 양수가 필요합니다.");
		}
	}
}

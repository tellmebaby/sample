package Hw01;


public class p123Q3 {
	/**
	 * 
	 * @param a
	 */
	public static void gugu (int a) {
		// 정수를 받아 1~9까지 곱해주는 메서드
		for (int i = 1; i <= a; i++) {
			System.out.print(a + "*" + i + "=" + a*i + " ");
		}
	}
	
	public static void main(String[] args) {
		// 구구단을 입력받은 단보다 작거나 같은수까지만 곱해서 출력
		
		int a = 2;
		while(a < 10)
			if( a == 10) {
				break;
			}else {
				gugu (a);
				a++;
				System.out.println();
			}	
	}
}

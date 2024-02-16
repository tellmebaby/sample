package Hw01;

public class p123Q2 {
	
	public static void gugu (int a) {
		// 정수를 받아 1~9까지 곱해주는 메서드
		for (int i = 1; i < 10; i++) {
			System.out.print(a + "*" + i + "=" + a*i + " ");
		}
	}

	public static void main(String[] args) {
		//구구단을 짝수단만 출력하도록
		
		int a = 2;
		while(a < 10)
			if( a == 10) {
				break;
			}else {
				
				if(a % 2 == 0) {
					gugu (a);
					a++;
				}else {
					a++;
					System.out.println();
					continue;
				}
				
			}	
	}
}

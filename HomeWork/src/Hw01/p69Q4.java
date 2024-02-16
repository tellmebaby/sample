package Hw01;
/**
 * 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
 */
public class p69Q4 {

	private static final char AE00 = 0;

	public static void main(String[] args) {
		
		int a = 10;
		double b = 2.0;
		int c = (int) (a + b);
		int d = (int) (a - b);
		int e = (int) (a * b);
		int f = (int) (a / b);
		
		
		System.out.println(a + " + " + b + "=" + c);
		System.out.println(a + " - " + b + "=" + d);
		System.out.println(a + " * " + b + "=" + e);
		System.out.println(a + " / " + b + "=" + f);
		
	}
}

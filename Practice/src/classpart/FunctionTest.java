package classpart;

public class FunctionTest {

	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static int  add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static int  minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static int  multiple(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static double  division(int n1, int n2) {
		double result = (double) n1 / (double) n2;
		return result;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); 													// add() 함수 호출
		int result1 = minus(num1, num2); 											// minus() 함수 호출
		int result2 = multiple(num1, num2); 										// multiple() 함수 호출
		double result3 = division(num1, num2); 										// division() 함수 호출
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
		System.out.println(num1 + " - " + num2 + " = " + result1 + "입니다");
		System.out.println(num1 + " * " + num2 + " = " + result2 + "입니다");
		System.out.println(num1 + " / " + num2 + " = " + result3 + "입니다");
	}
	
	
}

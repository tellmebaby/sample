package Hw01;

public class p89Q1 {

	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num;
		num = -5 +3 * 10 /2;
		System.out.println(num);
		
		num = 10;
		
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2>10));
		System.out.println(result);
		result = ((num1 > 10) || (num2>10));
		System.out.println(result);
		System.out.println(!result);
		
		num1 = 2;
		num2 = 10;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		num = 8;
		
		System.out.println(num += 10);
		System.out.println(num -= 10);
		System.out.println(num >>= 10);
		
		num = 10;
		num2 = 20;
		
		int result2 = (num >= 10) ? num2 + 10 : num2 - 10;
		System.out.println(result2);
		
		
		
	}
}

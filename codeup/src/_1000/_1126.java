package _1000;

/**
	철수는 정 수 두 개를 입력하면 두 수 사이의 기본 연산이 자동으로 이루어지는 프로그램을 제작하고 싶다.
	
	기본 연산이란, 더하기, 빼기, 곱하기, 나누기, 나머지 연산 등 5가지 연산을 말한다.
	
	두 정수의 기본 연산을 출력하는 정수 계산기를 제작하시오.
 */
import java.util.Scanner;

public class _1126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (a+b);
		int d = (a-b);
		int e = (a*b);
		int f = (a/b);
		int g = (a%b);
		
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " - " + b + " = " + d);
		System.out.println(a + " * " + b + " = " + e);
		System.out.println(a + " / " + b + " = " + f);
		System.out.println(a + " % " + b + " = " + g);
	}
}

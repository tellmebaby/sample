package _1000;

import java.util.Scanner;

/**
 * 두 정수(a, b)를 입력받아
a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.


참고
어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational)를 사용할 수 있다.

비교/관계연산자 == 는
두 개의 값이 같은 경우 참(true)을 나타내는 정수값 1로 계산하고,
다른 경우 거짓(false)를 나타내는 정수값 0으로 계산한다.

비교/관계연산자도 일반적인 사칙연산자처럼 주어진 두 수를 이용해 계산을 수행하고,
그 결과를 1(참), 또는 0(거짓)으로 계산해 주는 연산자이다.

비교/관계연산자는 >, <, >=, <=, ==(같다), !=(다르다) 6개가 있다.

** 수학에서 왼쪽과 오른쪽의 계산 결과가 같음(동치)을 나타내는 기호 = 는
C언어에서 전혀 다른 의미로 사용된다.

a=1 와 같은 표현은 a와 1의 값이 같다는 의미가 아니라
오른쪽의 계산 결과인 1을 왼쪽의 변수 a에 저장하라는 의미이다.

 */
public class _1050 {

	public static void main(String[] args) {
		//입력
		//두 정수 a, b가 공백을 두고 입력된다.
		//-2147483648 <= a, b <= +2147483647
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		/**
		int c;
		*/
		//출력
		//a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
		System.out.println((a==b)?1:0);
		/**
		if(a==b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		*/
	}
}

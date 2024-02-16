package _1000;

import java.util.Scanner;

/*
 * 입력:
 * 	첫 줄에 이 삼각격자의 세로 길이 N이 입력된다.(2 <= N <= 20)
   	둘째 줄부터 N+1째 줄까지 (k, 1)의 격자판의 정보가 입력된다. ( 1 <= k <= N)
   	출력:
   	N크기의 삼각 격자판을  출력하시오.
   	(출력할 때 각 행의 마지막에 공백을 넣어 출력하세요.(표현 오류때문))
 */
public class _1508 {

	public static void main(String[] args) {
		
		/*
		 순서도
		 1. 정수 N을 입력받는다.
		 2. N행 N열의 2차원 배열을 생성한다.
		 3. N번 반복하여, N개의 정수를 배열의 j+1 번째 순서대로 값을 계산한다.
		 4. 
		 	배열을 아래의 반복변수 i,j 로 반복한다.
		 	i : 1~(N-1)
		 	j : 1~i
		 	arr[i][j] = arr[i][j-1] - arr[i-1][j-1]
		 	수식으로 연산하여, ?(빈칸)에 대입한다.
		 5. 배열을 반복하여, 값이 있는 부분만 출력한다.	
		 	
		 */
		
		// 입력(1차배열 갯수)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int [N][N];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();	
		}
		
		// i: 1~(N-1)
		// j: 1~i
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

		/*
		
		// N갯수만큼의 배열을 만들어준다.
		int arr1[] = new int [N];
		
		// 만들어진 배열의 갯수만큼 첫행에 들어갈 숫자를 입력받는다.
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		// 입력받은 N으로 출력할 배열을 만든다.
		int arr[][] = new int[N][];
		
		// 2차배열을 삼각으로 만들어준다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		//첫행 넣기
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < 1; k++) {
					arr[j][k]=arr1[i+1];
					System.out.println(j + "번째" + k + "입니다." + "지금넣은숫자는" + arr1[i+1]);
				}
			}
			System.out.println();
		}

		// 출력부분
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(i + "번째" + j + "입니다." + arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		sc.close();
	}
}

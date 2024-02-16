package _1000;

import java.util.Scanner;

public class _1502 {
// n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.
	public static void main(String[] args) {
		// 입력
				// 2차원 배열의 크기 n이 입력된다.(n<=50) 2
				
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				int num = 1;
				int arr[][] = new int[N][N];
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr [j][i] = num++;
					}
				}
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
		
		sc.close();
	}
}

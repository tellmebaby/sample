package _1000;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int arr[][] = new int [N][N];

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// 입력되는건 j가 아니라 count
				if( i % 2 == 0 ) {
					//i가 짝수일경우 j는 증가
					if( j % N == 0 && count != 0 ) {
						count += N;
						arr [i][j] = count;
						System.out.print(arr[i][j]+" ");
					}else {
						arr [i][j] = count += 1;
						System.out.print(arr[i][j]+" ");
					}
					
				}else {
					//i가 홀수일경우 j는 N값을 더해서 1씩 감소
					if( j % N == 0) {
						count += N;
						arr [i][j] = count;
						System.out.print(arr[i][j]+" ");
					}else {
						arr [i][j] = count -= 1;
						System.out.print(arr[i][j]+" ");
					}
					
				}
				
			}
			System.out.println();
			
		}
	
		sc.close();
		
	}
}

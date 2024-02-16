package _1000;

import java.util.Scanner;

/*
 * 1441 : 버블 정렬
 * 
 * 
 */

public class _1441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A[] = new int [5];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < A.length-1; i++) {
//				System.out.print((i+1) + " Pass : ");
			for (int j = 0; j < 4-i; j++) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}else {
					
				}
			}
		}
		
		for (int i : A) {
			System.out.println(i);
		}
		System.out.println();
	}
	
	
	
}

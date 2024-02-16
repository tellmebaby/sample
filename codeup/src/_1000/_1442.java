package _1000;

import java.util.Scanner;

/**
 * 1442 : 선택 정렬
 * 
 * 오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고, 
 * 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고, ... 
 * 이런식으로 정렬하는 방식'이다.
 * 이번 문제는 미리 작성된 코드를 보고 빈 칸에 들어갈 코드를 작성하는 것이다.
 * 이 프로그램은 선택 정렬을 구현한 것이며, 실행 결과는 오름차순으로 정렬된다.
 * 빈 칸에 들어갈 코드만 작성해서 제출하시오.
 */

public class _1442 {

	public static void main(String[] args) {
		//입력: 정수 다섯개
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int [6];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
	
//		 for (int i = 0; i < A.length - 1; i++) {
//	            int minIndex = i; //최솟값의 인덱스
//	            for (int j = i + 1; j < A.length; j++) {
//	                if (A[j] < A[minIndex]) {
//	                    minIndex = j;
//	                }
//	            }
//	            //최솟값과 현재값을 바꿔줌
//	            int temp = A[i];
//	            A[i] = A[minIndex];
//	            A[minIndex] = temp;
//	        }
		
		
		
		// 오름차순으로 맞추기 위해 반복 비교
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				
				int temp = A[i];
				
				if(A[i] >= A[j]) {				
					// 비교자신과 같거나 작을경우 다음차례로 넘어간다.
				}else {
					// 비교자신보다 큰수를 자신의 자리와 바꾼다.
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		 
		
		// 출력
		 
		for (int i = 0; i < 5; i++) {
			System.out.println(A[i]);
		}

		
	}
	
}

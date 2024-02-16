package _1000;
/*
 * 1443 : 삽입 정렬
 */
public class _1443 {

	public static void main(String[] args) {
		
		int A[] = {1,8,2,4,6,2};
		
		for (int i = 1; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				System.out.print("현재 j열" + j + " : ");
				//가장 처음엔 두번째 요소를 선택
				int w = j-1; // 1.w=0
				int key = A[j]; //1.key=2
				
				System.out.println(A[j-1] + "와" + key + "를 비교");
				if(A[j-1] > key ) {
					System.out.println(A[j-1] + "가" + key + "보다 커서 자리바꿈");
					A[w+1] = A[j-1]; // 0을 1에 = 1을 두번째로
					A[j-1] = key; // 키값을 앞의 숫자로 교체 key = 1
					
				}else {
					// (앞의 요소) < (KEY)
					
					A[j] = key;
				
				}
			}
		}
		
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

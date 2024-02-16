package _1000;

import java.util.Scanner;

/**
 * 시작단과 마지막 단을 입력하면

그 구간의 구구단을 출력하는 프로그램을 작성하시오.
 */
public class _1351 {

	 public static void main(String[] args) {

	        // 입력문
	        Scanner sc = new Scanner(System.in);
	        int startNum = sc.nextInt(); // 시작단
	        int endNum = sc.nextInt(); // 끝단

	        // 출력문
	        if (startNum < 1 || startNum > 9 || endNum < 1 || endNum > 9) {
	            System.out.println("입력이 잘못되었습니다.");
	        } else {
	            for (int i = startNum; i <= endNum; i++) {
	                for (int j = 1; j <= 9; j++) {
	                    System.out.println(i + "*" + j + "=" + (i * j));
	                }
	             
	            }
	        }
	    }
}

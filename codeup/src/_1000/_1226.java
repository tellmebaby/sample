package _1000;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int a5 = sc.nextInt();
        int a6 = sc.nextInt();
        int bonusNum = sc.nextInt(); // 보너스 번호를 따로 입력받습니다.
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();
        int b5 = sc.nextInt();
        int b6 = sc.nextInt();

        int arr1[] = {a1, a2, a3, a4, a5, a6};
        int arr2[] = {b1, b2, b3, b4, b5, b6};

        int checkCount = 0;
        int checkBonus = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    checkCount += 1;
                }
            }
        }
        // 보너스 번호가 일치하는지 확인합니다.
        if(checkCount == 5) {
        	for (int i : arr2) {
        		if (i == bonusNum) {
        			checkBonus = 1;
        		}
        	} 
    	}

        // 결과 출력
        switch (checkCount) {
            case 0:
            case 1:
            case 2:
                System.out.println("0");
                break;
            case 3:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                if (checkBonus == 1) {
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }
                break;
            case 6:
                System.out.println("1");
                break;
        }
    }
}

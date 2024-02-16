package _1000;

import java.util.Scanner;

public class _1357 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ln = sc.nextInt();
		int check = 0;
		
		for (int i = 0; i < ln; i++) {
			check += 1;
			for (int j = 0; j < check; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < ln-1; i++) {
			check -= 1;
			for (int j = 0; j < check; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

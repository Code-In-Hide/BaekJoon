package Qize.Q2442;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 1; i <= inp; i++) {
			for (int j = i; j < inp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package Qize.Q2441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			for (int k = 0; k <= i-1; k++) {
				System.out.print(" ");
			}
			for (int j = N; j >= i + 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
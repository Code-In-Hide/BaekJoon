package Qize.Q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 5
		int M = sc.nextInt(); // 4

		int[] b = new int[N];
		for (int i = 0; i < M; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for (int x = I - 1; x <= J - 1; x++) {
				b[x] = K;
			}
		}
		for (int y = 0; y < b.length; y++) {
			System.out.print(b[y] + " ");
		}
		System.out.println();

		sc.close();
	}
}

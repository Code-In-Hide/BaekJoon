package Qize.Q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 5
		int M = sc.nextInt(); // 4

		int[] b = new int[N]; // 배열 개수 N개 생성
		for (int i = 0; i < M; i++) { // i 가 M보다 작을때까지 I,J,K 입력
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for (int x = I - 1; x <= J - 1; x++) { // I~J까지 범위 정할때
				b[x] = K; // I~J까지 정한 범위에 K값 입력
			}
		}
		sc.close();
		for (int y = 0; y < b.length; y++) { // 배열 개수만큼 출력
			System.out.print(b[y] + " ");
		}
	}
}

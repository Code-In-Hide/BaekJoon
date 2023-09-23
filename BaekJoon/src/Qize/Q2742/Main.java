package Qize.Q2742;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		int a = b.nextInt();
		int c = a;

		for (int i = a; i > 0; i--) {
			c = i;
			System.out.println(c);
		}
	}
}


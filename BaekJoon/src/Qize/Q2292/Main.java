package Qize.Q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int finish = sc.nextInt();
		sc.close();
		
		int start = 1, cnt = 1;
		while (true) {
			if(finish <= start) {
				break;
			}
			start = start + 6 * cnt++;
		}
		System.out.println(cnt);
	}
}

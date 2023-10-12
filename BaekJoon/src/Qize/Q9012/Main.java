package Qize.Q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int cnt = 0;
			String trueandfalse = sc.next();
			String[] str = trueandfalse.split("");

			for (int j = 0; j < str.length; j++) {
				if (cnt < 0) {
					break;
				} else if (str[j].equals("(")) {
					cnt++;
				} else if (str[j].equals(")")) {
					cnt--;
				}
			}

			if (cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}

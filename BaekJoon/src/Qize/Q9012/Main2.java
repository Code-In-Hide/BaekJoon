package Qize.Q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			Boolean bStr = true;
			stk.clear();
			String trueandfalse = sc.next();

			for (int j = 0; j < trueandfalse.length(); j++) {
				if (trueandfalse.charAt(j) == '(') {
					stk.push('(');
				} else {
					if (stk.isEmpty()) {
						bStr = false;
						break;
					} else {
						stk.pop();
					}
				}
			}
			if (stk.isEmpty() && bStr == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}

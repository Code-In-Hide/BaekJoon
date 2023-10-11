package Qize.Q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<>();
		int back = 0;
		try {
			int X = Integer.parseInt(br.readLine());
			for (int i = 0; i < X; i++) {
				String inp = br.readLine();
				StringTokenizer st = new StringTokenizer(inp);
				String cmd = "";
				int num = 0;
				if (st.countTokens() == 2) {
					cmd = st.nextToken();
					num = Integer.parseInt(st.nextToken());
				} else {
					cmd = st.nextToken();
				}
				switch (cmd) {
				case "push":
					back = num;
					que.offer(num);
					break;

				case "pop":
					if (que.size() == 0) {
						System.out.println("-1");
					} else {
						System.out.println(que.poll());
					}
					break;

				case "size":
					System.out.println(que.size());
					break;

				case "empty":
					if (que.isEmpty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
					break;

				case "front":
					if (que.size() == 0) {
						System.out.println("-1");
					} else {
						System.out.println(que.peek());
					}
					break;

				case "back":
					if (que.size() == 0) {
						System.out.println("-1");
					} else {
						System.out.println(back);
					}
					break;
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

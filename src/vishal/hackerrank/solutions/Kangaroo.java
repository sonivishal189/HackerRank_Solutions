package vishal.hackerrank.solutions;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		System.out.println(kangaroo(x1, v1, x2, v2));
		sc.close();
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		for (int i = 0; i < 20001; i++) {
			if (x1 == x2) {
				return "YES";
			}
			x1 += v1;
			x2 += v2;
		}
		return "NO";
	}

}

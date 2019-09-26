package vishal.hackerrank.solutions;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int x = 0;
		int count = 0;
		boolean valleyPossible = false;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'U') {
				x++;
			} else if (str.charAt(i) == 'D') {
				x--;
			}
			if (x == -1) {
				valleyPossible = true;
			} else if (x == 1) {
				valleyPossible = false;
			}
			if (valleyPossible && x == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}

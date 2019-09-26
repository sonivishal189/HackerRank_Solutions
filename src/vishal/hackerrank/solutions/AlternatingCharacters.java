package vishal.hackerrank.solutions;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s = "";
		while (t-- > 0) {
			s = sc.next();
			System.out.println(alternatingCharacters(s));
		}
		sc.close();
	}

	static int alternatingCharacters(String s) {
		int count = 0;
		if (s.length() == 1) {
			return 0;
		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i-1) == s.charAt(i)) {
				count++;
			}
		}
		return count;
	}

}

package vishal.hackerrank.solutions;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long n = sc.nextLong();
		int strLen = str.length();
		long count = 0;
		for (int i = 0; i < strLen; i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		long repeat = n / strLen;
		count = count * repeat;
		long len = Math.abs(n - (strLen * repeat));
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}

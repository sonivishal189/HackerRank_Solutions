package vishal.hackerrank.solutions;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aCount = sc.nextInt();
		int apples[] = new int[aCount];
		int oCount = sc.nextInt();
		int oranges[] = new int[oCount];
		for (int i = 0; i < aCount; i++) {
			apples[i] = sc.nextInt();
		}
		for (int i = 0; i < oCount; i++) {
			oranges[i] = sc.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apples, oranges);
		sc.close();
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int aCount = 0;
		int oCount = 0;
		for (int i = 0; i < apples.length; i++) {
			if (a + apples[i] >= s && a + apples[i] <= t) {
				aCount++;
			}
		}
		for (int i = 0; i < oranges.length; i++) {
			if (b + oranges[i] >= s && b + oranges[i] <= t) {
				oCount++;
			}
		}
		System.out.println(aCount + "\n" + oCount);
	}

}

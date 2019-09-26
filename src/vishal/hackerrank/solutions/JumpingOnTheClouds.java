package vishal.hackerrank.solutions;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int clouds[] = new int[n];
		for (int i = 0; i < n; i++) {
			clouds[i] = sc.nextInt();
		}
		int count = jumpingOnClouds(clouds);
		System.out.println(count);
		sc.close();
	}

	static int jumpingOnClouds(int[] clouds) {
		int count = 0;
		for (int i = 0; i < clouds.length; i++) {
			if (i + 2 < clouds.length && clouds[i + 2] == 0) {
				i++;
			}
			if (i != clouds.length - 1)
				count++;
		}
		return count;
	}

}

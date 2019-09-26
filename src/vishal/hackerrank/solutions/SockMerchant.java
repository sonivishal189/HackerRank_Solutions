package vishal.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int socks[] = new int[n];
		for (int i = 0; i < n; i++) {
			socks[i] = sc.nextInt();
		}
		Arrays.sort(socks);
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			if(socks[i] == socks[i+1]) {
				count++;
				i++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}

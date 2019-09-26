package vishal.hackerrank.solutions;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (s == null || s.trim().equals("")) {
			System.out.println("0");
			scan.close();
			return;
		}
		String[] items = s.trim().split("[ !,?.\\_'@]+");
		System.out.println(items.length);
		for (String item : items) {
			System.out.println(item);
		}
		scan.close();
	}

}

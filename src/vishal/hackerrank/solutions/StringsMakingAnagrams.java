package vishal.hackerrank.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsMakingAnagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(makeAnagram(a, b));
		sc.close();
	}

	static int makeAnagram(String a, String b) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			} else {
				map.put(a.charAt(i), 1);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (map.containsKey(b.charAt(i))) {
				if (map.get(b.charAt(i)) == 1) {
					map.remove(b.charAt(i));
				}else {
					map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
				}
			} else {
				count++;
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			count += entry.getValue();
		}
		return count;
	}

}

package vishal.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> grades = new ArrayList<Integer>();
		for(int i=0 ; i<n ; i++) {
			grades.add(sc.nextInt());
		}
		System.out.println(gradingStudents(grades));
		sc.close();
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> res = new ArrayList<Integer>();
		for (int grade : grades) {
			if (grade >= 38) {
				int val = grade / 5;
				if ((val+1)*5 - grade < 3) {
					res.add((val+1)*5);
				} else {
					res.add(grade);
				}
			} else {
				res.add(grade);
			}
		}
		return res;
	}
}

package 알고리즘.Int;

import java.util.*;

public class 피보나치수열 {

	public int[] solution(int n) {
		int answer[] = new int[n];

		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			int num = answer[i - 2] + answer[i - 1];
			answer[i] = num;
		}

		return answer;
	}

	public static void main(String[] args) {
		피보나치수열 main = new 피보나치수열();
		Scanner sc = new Scanner(System.in);

		int result[] = main.solution(sc.nextInt());

		for (int x : result) {
			System.out.print(x + " ");
		}

	}

}

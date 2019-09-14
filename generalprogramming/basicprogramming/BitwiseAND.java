/**
 * 
 * Problem Statement-
 * [Bitwise AND](https://www.hackerrank.com/challenges/linkedin-practice-bitwise-and/problem)  
 * 
 */


import java.util.Scanner;
/**
 * @author nagasai praveen
 *
 */
public class BitwiseAND {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int result = getMaxValue(N, K);
			System.out.println(result);
		}
		sc.close();
	}

	/**
	 * @param n
	 * @return
	 */
	private static int getMaxValue(int n, int k) {
		if (((k - 1) | k) <= n)
			return k - 1;
		return k - 2;
	}
}

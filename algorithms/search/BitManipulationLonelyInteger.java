/**
 * 
 * Problem Statement-
 * [Bit Manipulation: Lonely Integer](https://www.hackerrank.com/challenges/ctci-lonely-integer/problem)
 * 
 */

import java.util.Scanner;

/**
 * @author nagasai praveen
 *
 */
public class BitManipulationLonelyInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for (int i = 0; i < n; i++) {
			res ^= sc.nextInt();
		}
		System.out.println(res);
		sc.close();
	}
}

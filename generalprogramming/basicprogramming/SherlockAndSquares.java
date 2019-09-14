/**
 * 
 * Problem Statement-
 * [Sherlock and Squares](https://www.hackerrank.com/challenges/sherlock-and-squares/problem)
 * 
 */


import java.util.Scanner;

/**
 * @author nagasai praveen
 *
 */public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;
			count = (int) Math.floor(Math.sqrt(B)) - (int) Math.ceil(Math.sqrt(A)) + 1;
			System.out.println(count);
		}
		sc.close();
	}

}

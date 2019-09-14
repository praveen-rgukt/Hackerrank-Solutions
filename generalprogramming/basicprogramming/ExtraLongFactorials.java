/**
 * 
 * Problem Statement-
 * [Extra Long Factorials](https://www.hackerrank.com/challenges/extra-long-factorials/problem)
 * 
 */


import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author nagasai praveen
 *
 */
public class ExtraLongFactorials {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger b = BigInteger.ONE;
		while (n >= 1) {
			b = b.multiply(new BigInteger(n + ""));
			n--;
		}
		System.out.println(b);
		in.close();
	}
}

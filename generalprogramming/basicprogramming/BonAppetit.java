/**
 * 
 * Problem Statement-
 * [Bon Appétit](https://www.hackerrank.com/challenges/bon-appetit/problem)        
 * 
 */


import java.util.Scanner;

/**
 * @author nagasai praveen
 *
 */
public class BonAppetit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int bCharged = 0, sum = 0, bActual = 0;
		for (int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			if (k != i)
				sum += cost;
		}
		bActual = sum / 2;
		bCharged = sc.nextInt();
		if (bActual == bCharged) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(bCharged - bActual);
		}
		sc.close();
	}
}

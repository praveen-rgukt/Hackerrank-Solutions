/**
 * 
 * Problem Statement-
 * [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum)   

 * 
 */
/**
 * @author nagasai praveen
 *
 */
public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			sum += in.nextLong();
		}
		System.out.println(sum);
		in.close();

	}
}

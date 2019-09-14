/**
 * 
 * Problem Statement-
 * [Height of a Binary Tree](https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem)   
 * 
 */
/**
 * @author nagasai praveen
 *
 */
public class HeightOfABinaryTree {
	class Node {
		int data;
		Node left;
		Node right;
	}

	int height(Node root) {
		if (root == null)
			return 0;
		return (Math.max(height(root.left), height(root.right)) + 1);

	}

}

/**
 * 
 * Problem Statement-
 * [Postorder Traversal](https://www.hackerrank.com/challenges/tree-postorder-traversal)   
 * 
 */


/**
 * @author nagasai praveen
 *
 */
public class PostorderTraversal {
	class Node {
		int data;
		Node left;
		Node right;
	}

	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");

		}
	}
}

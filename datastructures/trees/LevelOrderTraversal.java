/**
 * 
 * Problem Statement-
 * [Level Order Traversal](https://www.hackerrank.com/challenges/tree-level-order-traversal/problem)   
 * 
 */


import java.util.LinkedList;
import java.util.Queue;


/**
 * @author nagasai praveen
 *
 */public class LevelOrderTraversal {
	class Node {
		int data;
		Node left;
		Node right;
	}

	void levelOrder(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {

			Node currentNode = q.poll();
			System.out.print(currentNode.data + " ");
			if (currentNode.left != null)
				q.add(currentNode.left);
			if (currentNode.right != null)
				q.add(currentNode.right);
		}

	}
}

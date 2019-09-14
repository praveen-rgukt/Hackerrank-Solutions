/**
 * 
 * Problem Statement-
 * [Print the Elements of a Linked List](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list)  
 * 
 */
/**
 * @author nagasai praveen
 *
 */

class PrintTheElementsOfALinkedList {

	class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}
}

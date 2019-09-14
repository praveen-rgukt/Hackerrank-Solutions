/**
 * 
 * Problem Statement-
 * [Reverse a linked list](https://www.hackerrank.com/challenges/reverse-a-linked-list/problem) 
 * 
 */
/**
 * @author nagasai praveen
 *
 */
public class ReverseALinkedList {
	class Node {
		int data;
		Node next;
	}

	Node Reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node remaing = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		return remaing;

	}

}

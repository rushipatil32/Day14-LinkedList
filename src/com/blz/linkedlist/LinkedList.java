package com.blz.linkedlist;

public class LinkedList {
	Node head;

	public class Node {
		Object data;
		Node ref;

		public Node(Object data) {
			this.data = data;
		}
	}
}
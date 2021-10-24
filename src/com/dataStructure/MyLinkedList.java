package com.dataStructure;

public class MyLinkedList {
	// variable declaration
	Node head;
	Node tail;

	// constructor
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	// method: add node
	public void add(int key) {
		Node newNode = new Node(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	// method: append node
	public void append(int key) {
		Node newNode = new Node(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = tail;
			this.tail = newNode;
			temp.next = newNode;
		}
	}

	// insert element
	public void insertNode(Node prevNode, int key) {
		Node newNode = new Node(key);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	// pop first element
	public void pop() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			temp = null;
		}
	}

	// method: print node
	public void printNode() {
		Node temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.key + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
	}
}

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
		} else {
			Node tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}
	}

	// method: append node
	public void append(int key) {
		Node newNode = new Node(key);

		if (tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
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

package com.dataStructure;

public class MyLinkedList {
	//variable declaration
	Node head;
	Node tail;
	
	//constructor
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
	
	//method: print node
	public void printNode() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.key);
			temp = temp.next;
		}
		System.out.print(temp.key);
	}
}

package com.dataStructure;

public class Node {
	//variable declaration
	public int key;
	public Node next;
	
	//constructor
	public Node(int key) {
		this.key = key;
		this.next = null;
	}

	//getter and setter
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}

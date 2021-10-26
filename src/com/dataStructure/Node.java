package com.dataStructure;

public class Node<E> {
	//variable declaration
	public int key;
	public Node<E> next;
	
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

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
}

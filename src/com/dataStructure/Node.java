package com.dataStructure;

public class Node<K> {
	//variable declaration
	public K key;
	public Node next;
	
	//constructor
	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	//getter and setter
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}

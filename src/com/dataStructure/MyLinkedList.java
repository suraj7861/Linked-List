package com.dataStructure;

public class MyLinkedList<K> {
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
	public void add(K key) {
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
	public void append(K key) {
		Node newNode = new Node(key);

		if (tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	//method: Insert element
    public void insert(Node myNode,Node newNode){
        Node tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
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

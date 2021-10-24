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

	// method: Insert element
	public void insert(Node myNode, K key) {
		Node newNode = new Node(key);
		Node tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// method: Pop element
	public Node pop() {
		Node tempNode = head;
		head = head.getNext();
		return tempNode;
	}

	public Node popLast() {
		Node tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		System.out.println(tail);
		tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;

	}

	// method: search element
	public void searchElement(K key) {
		Node tempNode = head;
		boolean flag = false;
		while (tempNode != null) {
			if (tempNode.getKey() == key) {
				System.out.println(key + ": Element found in th LinkedList: ");
				flag = true;
			}
			tempNode = tempNode.getNext();
		}
		if (flag == false) {
			System.out.println(key + ": Element not found in th LinkedList: ");
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

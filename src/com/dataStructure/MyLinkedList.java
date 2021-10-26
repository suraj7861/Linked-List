package com.dataStructure;

public class MyLinkedList<E> {
	// variable declaration
	Node<E> head;
	Node<E> tail;

	// constructor
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	// method: add node
	public void add(int key) {
		Node<E> newNode = new Node<E>(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node<E> temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}

	// method: append node
	public void append(int key) {
		Node<E> newNode = new Node<E>(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node<E> temp = tail;
			tail = newNode;
			temp.next = newNode;
		}
	}

	// insert element
	public void insertNode(Node<E> prevNode, int key) {
		Node<E> newNode = new Node<E>(key);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	// pop first element
	public void pop() {
		if (head != null) {
			Node<E> temp = head;
			head = head.next;
			temp = null;
		}
	}

	//// pop Last element
	public void popLast() {
		Node<E> temp = head;
		while (!temp.next.equals(tail)) {
			temp = temp.next;
		}
		tail = temp;

	}

	//search element
	public void searchElement(int key) {
		Node<E> tempNode = head;
		boolean flag = false;
		while (tempNode != null) {
			if (tempNode.getKey() == key) {
				System.out.println(key+": elemet found in LinkedList");
				flag =true;
			}
			tempNode = tempNode.getNext();
		}
		if(flag == false) {
			System.out.println(key+": elemet not found in LinkedList");
		}
	
	}
	
	//
    public void deleteElement(int key) {
        Node<E> tempNode = head;
        while (tempNode.getNext().getKey() != key) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }
    
    //size of LinkedList
    public void getSize() {
        int size = 0;
        Node<E> tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        System.out.println("size of LinkedList is: "+size);
    }

	// method: print node
	public void printNode() {
		Node<E> temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.key + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
	}
}
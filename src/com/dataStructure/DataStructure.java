package com.dataStructure;

public class DataStructure {
	public static void add() {
		// create object
		MyLinkedList list = new MyLinkedList();
		// add key
		list.add(70);
		list.add(30);
		list.add(56);
		// print node
		list.printNode();
	}

	// append element in LinkList
	public static void append() {
		// create object
		MyLinkedList list = new MyLinkedList();
		// append
		list.append(56);
		list.append(30);
		list.append(70);
		// print node
		list.printNode();

	}

	// insert node in LinkList
	public static void insertNode() {
		// create object
		MyLinkedList list = new MyLinkedList();
		// insert node
		list.append(56);
		list.append(70);
		list.insertNode(list.head, 30);
		// print node
		list.printNode();

	}

	// delete first element
	public static void popFirst() {
		MyLinkedList list = new MyLinkedList();
		list.add(70);
		list.add(30);
		list.add(56);
		list.pop();
		list.printNode();
	}

	// delete last element
	public static void popLast() {
		MyLinkedList list = new MyLinkedList();
		list.add(70);
		list.add(30);
		list.add(56);
		list.popLast();
		list.printNode();
	}

	// find element
	public static void searchElement() {
		MyLinkedList list = new MyLinkedList();
		list.add(70);
		list.add(30);
		list.add(56);
		list.printNode();
		System.out.println();
		list.searchElement(30);
	}
	
	// insert element 40 after 30
	public static void insertElement() {
		MyLinkedList list = new MyLinkedList();
		list.add(70);
		list.add(30);
		list.add(56);
		list.insertNode(list.head.getNext(), 40);
		list.printNode();		
	}
	
	// delete 40
	public static void delete() {
		MyLinkedList list = new MyLinkedList();
		list.add(70);
		list.add(30);
		list.add(40);
		list.add(56);
		list.deleteElement(40);
		list.getSize();
		list.printNode();		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		System.out.println("Add element");
		add();
		System.out.println("\n--------");
		System.out.println("Append element");
		append();
		System.out.println("\n--------");
		System.out.println("Added 30 in between 56 and 70");
		insertNode();
		System.out.println("\n--------");
		System.out.println("Delete first element");
		popFirst();
		System.out.println("\n--------");
		System.out.println("Delete last element");
		popLast();
		System.out.println("\n--------");
		System.out.println("search LinkList to find element");
		searchElement();
		System.out.println("\n--------");
		System.out.println("insert 40 after 30 ");
		insertElement();
		System.out.println("\n--------");
		System.out.println("Delete 40 and show size of LinkedList ");
		delete();
	}
}

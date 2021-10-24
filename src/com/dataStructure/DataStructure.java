package com.dataStructure;

public class DataStructure<K> {
	public static void add() {
		//create object
		MyLinkedList list = new MyLinkedList();
		//add key 
		list.add(70);
		list.add(30);
		list.add(56);
		//print node
		list.printNode();
	}
	public static void append() {
		//create object
		MyLinkedList list = new MyLinkedList();
		//append  
		list.append(56);
		list.append(30);
		list.append(70);
		//print node
		list.printNode();

	}

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		System.out.println("Add element");
		add();
		System.out.println("\n--------");
		System.out.println("Append element");
		append();
	}
}

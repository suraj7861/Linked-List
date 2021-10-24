package com.dataStructure;

public class DataStructure {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		//create object
		MyLinkedList list = new MyLinkedList();
		//add key 
		list.add(70);
		list.add(30);
		list.add(56);
		//print node
		list.printNode();
	}

}

package com.dataStructure;

public class DataStructure {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		//create object
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		//add key 
		list.add(70);
		list.add(30);
		list.add(56);
		//print node
		list.printNode();
		System.out.println("\n--------");
		//append  
		list.append(56);
		list.append(30);
		list.append(70);
		//print node
		list.printNode();
		System.out.println("\n--------");
		//insert 30
		list.append(56);
		list.append(70);
		list.printNode();
		

	}

}

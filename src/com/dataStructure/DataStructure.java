package com.dataStructure;

public class DataStructure {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		// create object
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		System.out.println("add key");
		// add key //UC 1,2
		list.add(70);
		list.add(30);
		list.add(56);
		// print node
		list.printNode();
		System.out.println("\nappend--------");
		// append //UC3
		list.append(56);
		list.append(30);
		list.append(70);
		// print node
		list.printNode();
		System.out.println("\ninsert--------");
		// insert 30 //UC4
		list.append(56);
		list.append(70);
		list.printNode();
		System.out.println("\npop first element--------");
		// pop first element //UC5
		list.append(56);
		list.append(30);
		list.append(70);
		list.pop();
		// print node
		list.printNode();
		System.out.println("\npop last element--------");
		// pop last element //UC6
		list.append(56);
		list.append(30);
		list.append(70);
		//list.popLast();
		// print node
		list.printNode();
		System.out.println("\nSearch element--------");
		// Search element //UC7
		list.append(56);
		list.append(30);
		list.append(70);
		list.searchElement(30);
	}

}

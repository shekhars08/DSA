package Linked;

import java.util.Scanner;

public class DoublyLinkedList {
	
	//Doubly linked list  structure
	static class Node {
		
		int data;
		Node prev;
		Node next;
		
		// Constructor
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
	}
	Node head = null;
	Node tail = null;
	
	
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		} 
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void display() {
		Node currentNode = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		System.out.println("NULL->");
		while(currentNode != null) {
			System.out.println(currentNode.data +"-> ");
			currentNode = currentNode.next;
		}
		System.out.println("NULL");

	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dlist = new DoublyLinkedList();
		
		for(int i=0; i<5; i++) {
			int listdata = sc.nextInt();
			dlist.push(listdata);
		}
		System.out.println("Doubly LinkedList : ");
		dlist.display();
		System.out.ptintln("Helol");
		sc.close();
	}
}

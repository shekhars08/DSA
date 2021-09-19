package Linked;

import java.util.Scanner;

public class CircularLinkedList {
	
	
	static class Node {
		int data;
		Node next;
		
		//Constructor
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node  head;
	Node tail;
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display() {
		Node currNode = head;
		if(head == null) {
			System.out.println("List is underflow");
		}
		else {
			System.out.println("Nodes ofcircular linked list :");
			do {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
			while(currNode != head); 
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		CircularLinkedList clist = new CircularLinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the list data");
		for(int i=0;i<n; i++) {
			int listdata = sc.nextInt();
			clist.push(listdata);
		}
		
		clist.display();
		sc.close();
		
		}

}

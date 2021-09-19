package Linked;
import java.util.*;

public class RevSinglyLinkedList {
	
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if(head == null) {
			head = newNode;
			return;
		}
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	Node reverse (Node head) {
		Node currNode = head;
		Node prevNode = null;
		Node nextNode;
		while(currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
	}
	public void printList(Node newhead) {
		while(newhead != null) {
			System.out.println(newhead.data +"->");
			newhead = newhead.next;
		}
		System.out.println("null");
	}
	
	

	public static void main(String[] args) {
		
		RevSinglyLinkedList list = new RevSinglyLinkedList();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list : ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Enter the list elements : ");
		for(int i=0; i<n; i++) {
			int listdata = sc.nextInt();
			list.add(listdata);
		}
		
		System.out.println();
		System.out.println("Given List : ");
		list.printList(head);
		System.out.println();
		System.out.println("Reversed List : ");
		Node newlist = list.reverse(head);
		
		list.printList(newlist);
		
		sc.close();

	}

}

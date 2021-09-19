package Linked;

public class MyLinkedList<E> {
	
Node<E> head;
	
	public static class Node<E> {
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
			
   }
	
	public boolean isEmpty() {
    	if (head == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	// Add element through the array
   public void add(E data) {
      Node<E> toAdd = new Node<E>(data);
    	
    	if(isEmpty()) {
    		head = toAdd;
    		return;
    	}
    	// Traversing through linkedList	
    	Node<E> temp = head;
    	while(temp.next != null) {
    		temp = temp.next;
    	}
    	// In this last node will be added 
    	temp.next = toAdd;
    }
   
   // To remove an element from the list 
   public E removeLast() throws Exception {
	   Node<E> temp = head;
	   
	   if(temp == null) {
		   throw new Exception("Cannot removr coz last list is empty");
	   }
	   
	   if(temp.next == null) {
		   Node<E> toRemove = head;
		   head = null;
		   return toRemove.data;
	   }
	   
   	while(temp.next.next != null) {
   		temp = temp.next;
   	  } 
   	 Node<E> toRemove = temp.next;
   	 temp.next = null;
   	 return toRemove.data;
   }
   
    
   public E getLast() throws Exception {
     Node<E> temp = head;
	   
	   if(temp == null) {
		   throw new Exception("Cannot peek coz last list is empty");
	   }
	   
   	while(temp.next != null) {
   		temp = temp.next;
   	  } 
   	 return temp.data;
   }
	   
    
    public void print() {
    	Node<E> temp = head;
    	while(temp != null) {
    		System.out.print(temp.data +" ");
    		temp = temp.next;
    	}
    }
    
    
	
	

}



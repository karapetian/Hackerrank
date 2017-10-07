package DataStructures;

import java.util.LinkedList;

public class Linked_1 {

	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int data) {
		Node current = new Node();
		if (head == null) {
			current.data = data;
			return current;
		} else {
			current = head;
			while (current.next != null) {
				current = current.next;
			}
			Node last = new Node();
			last.data = data;
			current.next = last;
			last.next = null;

			return head;
		}
	}

	Node InsertNth(Node head, int data, int position) {
		Node current = new Node();
		if (head == null) {
			current.data = data;
			return current;
		} else if (position == 0) {
			current.data = data;
			current.next = head;
			return current;
		} else {
			current = head;
			for (int i = 1; i <= position; i++) {
				// current = current.next;
				if (i == position) {
					Node inserted = new Node();
					inserted.data = data;
					inserted.next = current.next;
					current.next = inserted;
				}
				current = current.next;
			}
		}
		return head;
	}

	Node Delete(Node head, int position) {
		Node current = new Node();
		if (position == 0) {
			head = head.next;
			return head;
		} else {
			current = head;
			for (int i = 1; i <= position; i++) {
				if (i == position) {
					Node deleted = new Node();
					deleted = current.next;
					current.next = deleted.next;
				}
				current = current.next;
			}
		}
		return head;
	}
	
	void ReversePrint(Node head) {
		if (head==null){
		     return;
		 } else{
			 ReversePrint(head.next);
			 System.out.println(head.data);
		 }	
	}
	
	
	int GetNode(Node head,int n) {
	    Node current =head;
	    
	    int length = 1;
	    while(current.next!=null){
	        current=current.next;
	        length++;
	    }
	     current=head;
	    for(int i =1; i<length-n; i++){
	        current=current.next;
	    }
	    return current.data;
	}
	
	
	Node Reverse(Node head){
		Node current = head;
		if(head==null){
			return head;
		}
		while(current.next!=null){
			current.next=current;
			current=current.next;
		}
		if(current.next==null){
			return current;	
		}
		return current;
	}
	
	Node Reverse_2(Node head){
		if(head==null){
			return head;
		}
		Node next=null;
		if(head.next!=null){
			next=head.next;
			Reverse_2(next);
			next.next=head;
		}
		return head;
	}
	
	

}

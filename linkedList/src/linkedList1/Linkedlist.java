package linkedList1;

import java.util.Scanner;

public class Linkedlist {
	Node Head;
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		if(Head==null) {
			
			Head=node;
		}
		else {
			Node n=Head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
		}
		
	}
	public void insertAtstart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=Head;
		
		Head=node;
	}
	public void insertAt(int pos,int data) {
		Node node = new Node();
		node.data=data;
		
		Node n=Head;
		for (int i=1;i<pos-1;i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		
	} 
	public void deleteAt(int pos ) {
		if(pos==0) {
			Head=Head.next;
		}
		else {
			Node n=Head;
			Node n1=null;
			for(int i=0;i<pos-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	public int count() {
		int c=1;
		Node p=Head;
		while(p.next!=null) {
				c++;
				p=p.next;
				
			}
		
		return c;
	}
	public int search(int s) {
		Node current=Head;
		int c=1;
		while (current.next!=null) {
			try {	
			if(s==current .data) {
				System.out.println("The Key is found at location "+c);
				
			} 
				c++;
				current=current.next;
				
		}
			catch(Exception e) {
				System.out.println("The key is not found");
			}
			
		}
		return c ;
	}
	public void removeduplicate() {
		Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = Head;
 
        
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
           
            while (ptr2.next != null) {
 
                
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else  {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
		
	}
	public void show() {
		Node node=Head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	

}

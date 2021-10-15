package LinkedList;


public class MainLinkList<E> {
	
	Node<E> head; //first Node
	//Add Method
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		Node<E> temp =head;
		while(temp.Next!=null) {
			temp = temp.Next;
		}
		temp.Next =toAdd;
	}
	//PrEFunction 
	void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.Next;
		}
	}
	
	//Insert Node At First Of Linkedlist
	public void insertAtFirst(E data) {
		Node<E> newnode = new Node<E>(data);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.Next = head;
			head= newnode;
		}
	}
	
	//Insert Node At Specific Position
   public void insertAtSpecific(E position,E data) {
	 	Node<E> temp= head;
		Node<E> temp1 = temp.Next;
		Node<E> newnode = new Node<E>(data);
		while(temp1.data!=position) {

			   temp=temp.Next;
			   temp1 = temp1.Next;

		 }
		newnode.Next = temp1.Next;
		temp1.Next = newnode;

		
		}
	
	//Insert Node At End Position
	public void insertAtEnd(E data) {
		Node<E> temp=head;
		Node<E> newnode = new Node<E>(data);
		while(temp.Next!=null) {
			temp = temp.Next;
		}
		if(temp.Next==null) {
			temp.Next = newnode;
			newnode.Next = null;
		}
	}
	
	//Remove node at first
	void removeAtFirst() {
		Node<E> temp =head;
		if(temp==head) {
		   head= temp.Next;
		}
	}
	
	//Remove node at last
	public void removeAtEnd() {
		Node<E> temp = head;
		Node<E> temp1=temp;
		while(temp.Next!=null) {
			temp1=temp;
			temp=temp.Next;
		}
		temp1.Next = null;
	}
	
	//Remove at end and return data
	public E removeAtLast() {
		Node<E> temp = head;
		Node<E> nodeToRemove;
		while(temp.Next.Next!=null) {
			temp=temp.Next;
		}
	    nodeToRemove = temp.Next;
		temp.Next = null;
		return (E)nodeToRemove.data;
	}
	public E LastValue() {
		Node<E> temp = head;
		Node<E> nodeToRemove;
		while(temp.Next.Next!=null) {
			temp=temp.Next;
		}
	    nodeToRemove = temp.Next;
		return (E)nodeToRemove.data;
	}

	
	//Remove node at specific position
	void removeAtSpecific(E i) {
		Node<E> temp =head;
		Node<E> temp1 =temp.Next;
//		Node pos = new Node(i);
		while(temp1.data!=i) {
			temp = temp.Next;
			temp1 = temp1.Next;
		}
		temp.Next = temp1.Next;
		
	}
	
	//Empty method
 public	boolean isEmpty() {
		return head==null;
	}
	
	//Static class with Constructor
  public static class Node<E>{
	public E data;
	public Node<E> Next;
		
		public Node(E data) {
			this.data = data;
			Next=null;
		}
	}
}

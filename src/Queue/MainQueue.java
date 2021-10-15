package Queue;

import LinkedList.MainLinkList.Node;

public class MainQueue <E> {
	private Node<E> head,rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
		}
		
		rear.Next = toAdd;
		rear = rear.Next;
	}
	
	public E dequeue() throws Exception{
		Node<E> temp =head;
		if(head == null) {
			throw new Exception("The queue is empty"); 
		}
		head = head.Next;
		return temp.data;
		
	}
}

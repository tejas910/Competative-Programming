package Stack;

import LinkedList.MainLinkList;
//Implement Stack using linklist
public class MainStack<E> {
	private MainLinkList<E> ll = new MainLinkList<E>();
	
	void push(E data) {
		ll.add(data);
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Poping not allowed because stack is empty");
		}
		return ll.removeAtLast();
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peek return nothing ");
		}
		return ll.LastValue();
	}
}

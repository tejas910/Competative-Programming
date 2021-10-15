package anotherLinkList;

/*
 This is the class for creating single node.
 The node is the datatype which contain the data field and address field.
 The below class is used to create the single node if you want to create the node you have to call
 this class that time.
  */
class Node{
	int data;
	Node next;
}
//This is the class used for the Defination of the methods.
class Linked{
	//Method for Printing the List
	public void printList(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+" ");
		printList(node.next);
	}
	//Method for get New Node
	private Node getNewNode(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;
		return newnode;
	}
	//Method for insert New Node
	public Node insert(int data, Node node) {
		if(node == null) {
			return getNewNode(data);
		}
		else {
			node.next = insert(data, node.next);
		}
		return node;
	}
	//Method for get the size of linklist
	public int getSizeOfList(Node node) {
		if(node==null) {
			return 0;
		}
		
		return getSizeOfList(node.next) + 1;
		
	}
	//Method for search the data in linklist
	public boolean searchNode(int data,Node node) {
		if(node==null) {
			return false;
		}
		while(node.next!=null) {
			if(node.data==data) {
				return true;
			}
			node = node.next;
		}
		return false;
	}
	//Method for rotating the linklist by k 
	public Node rotateNode(int k, Node node) {
		if(node==null) {
			return node;
		}
		int sizeoflinklist = getSizeOfList(node);
		k = k % sizeoflinklist;
		if(k==0) {
			return node;
		}
		Node tmp = node;
		int i=1;
		while(i < sizeoflinklist-k) {
			tmp = tmp.next;
			i++;
		}
		Node temp = tmp.next;
		Node head = temp;
		tmp.next = null;
		i=1;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
		return head;
	}
	//Reverse the linklist 
	public Node reverseList(Node node) {
		if(node == null || node.next == null) {
			return node;
		}
		
		Node temp = reverseList(node.next);
		node.next.next = node;
		node.next =null;
		 
		return temp;
	}
	public Node getMiddleNode(Node node) {
		if(node == null) {
			return null;
		}
		Node a = node;
		Node b = node.next;
		
		while(b!=null && b.next!=null) {
			a = a.next;
			b = b.next.next;
		}
		return a;
	}
	
	public Node mergeSort(Node node) {
		if(node==null || node.next==null) {
			return node;
		}
		Node middle = getMiddleNode(node);
		Node se = middle.next;
		middle.next = null;
		return  merge(mergeSort(node), mergeSort(se));
	}
	public Node merge(Node a, Node b) {
		Node temp = new Node();
		Node finallist = temp;
		
		while(a!=null && b!=null) {
			if(a.data<b.data) {
				temp.next=a;
				a = a.next;
			}else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		temp.next = (a==null) ?b : a;
		return finallist.next;
		
	}
	public Node mergelist(Node a, Node b) {
		return merge(mergeSort(a), mergeSort(b));
	}
	
}
//This is the Defination of the main class.
public class LinkList {
	public static void main(String[] args) {
		Node root = null;   //Root node is also called head.
		Linked li = new Linked();
		root= li.insert(12, root);
		root= li.insert(2, root);
		root= li.insert(32, root);
		Node root1 = null;
	    root1= li.insert(11, root1);
		root1= li.insert(14, root1);
		
//		Node merge = li.mergelist(root, root1);
//		 li.printList(merge);
		Node m =  li.getMiddleNode(root);
		li.printList(m);
		//		System.out.println(li.searchNode(32, root));
//		root  = li.rotateNode(2, root);
//		int n = li.getSizeOfList(root);
//		for(int i=0;i<n;i++) {
//			li.rotateNode(i, root);
//			li.printList(root);
//		}
	}
}

package Tree;
import  java.util.*;
public class Tree {
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
//		inOrder(root);
//		System.out.println();
//		preOrder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.println();
//		int sum = getHightOfTree(root);
//		int sum = sumOfAllNode(root);
//		System.out.println(sum);
		int h = getHightOfTree(root);
		System.out.println(h);
	}
	
	//Static Method for create Tree 
	static Node createTree() {
		Node root = null;
		System.out.println("Enter Data");
		int data = sc.nextInt();
		if(data ==-1) {
			return null;
		}
		root = new Node(data);
		System.out.println("Enter left data: "+ data);
		root.left = createTree();
		System.out.println("Enter right data: "+ data);
		root.right = createTree();
		return root;
	}
	//Static method for inOrder traversal
	static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"  ");
		inOrder(root.right);
		
	}
	//Static method for preOrder traversal
	static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	//Static method for postOrder traversal
	static void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	//Static method for get sum of all nodes in tree
	static int getSumOfNode(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return root.data;
		}
		int count = root.data + getSumOfNode(root.left)+getSumOfNode(root.right);
		return count;
	}
	//Static method for get difference of even or odd values
	static int getDifferenceEvenOddValues(Node root) {
		if(root==null) {
			return 0;
		}
		return root.data-getDifferenceEvenOddValues(root.left)-getDifferenceEvenOddValues(root.right);		
	}
	//Static method for get count total numbers of nodes in tree
	static int countNode(Node root) {
		if(root==null) {
			return 0;
		}
		return 1 +countNode(root.left)+countNode(root.right);
	}
	
	static int leafNode(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return leafNode(root.left)+leafNode(root.right);
	}
	static int getHightOfTree(Node root) {
		if(root==null) {
			return -1;
		}
		return max(getHightOfTree(root.left), getHightOfTree(root.right))+1;
	}
	 static int max(int a, int b) {
		return a > b ? a : b;
	}
	static int sumOfAllNode(Node root) {
		if(root==null) {
			return -1;
		}
		if(root.left==null && root.right==null) {
			return root.data;
		}
		int left = sumOfAllNode(root.left);
		int right = sumOfAllNode(root.right);
		return root.data+left+right;
	}
	
	
}
class Node{
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
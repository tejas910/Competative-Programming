//package Tree;
//import java.util.*;
//public class Tree1 {
//	static Scanner sc = null;
//	public static void main(String[] args) {
//		sc = new Scanner(System.in);
//		createTree1();
//	}
//	static Node createTree1() {
//		Node root = null;
//		System.out.println("Enter data:");
//		int data = sc.nextInt();
//		if(data==-1) {
//			return null;
//		}
//		root = new Node(data);
//		System.out.println("Enter data of left of: "+data);
//		root.left= createTree1();
//		System.out.println("Enter data of right of: "+data);
//		root.left= createTree1();
//		return root;
//	}
//}
//class Node{
//	Node left,right;
//	int data;
//	public Node(int data) {
//		this.data = data;
//	}
//}
//

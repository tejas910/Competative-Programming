import java.util.*;
public class StackSort {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Stack<Integer> s = new Stack<>();
		st.push(1);
		st.push(4);
		st.push(5);
		st.push(2);
		st.push(3);
	
		System.out.println(Collections.min(st));
		while(!st.isEmpty()) {
			s.push(st.pop());
		}
		System.out.println(s);
	}
}	

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		String str = "TejasPatil";
		Stack<Character> stack = new Stack<>();
		char c[] = str.toCharArray();
		char arr[] = new char[c.length];
		int i=0;

		while(i<c.length) {
			stack.push(c[i]);
			i++;

		}
		i=0;
		System.out.println(stack);
		for(int j=0;j<c.length;j++) {
			arr[j] = stack.pop();
		}
	
		String str1 = new String(arr);
				
	}
}

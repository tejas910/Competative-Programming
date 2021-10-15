package Stack;

public class StackImpl {
	public static void main(String[] args) throws Exception {
		MainStack<String> stack = new MainStack<>();
		stack.push("Tejas");
		stack.push("Pramod");
		stack.push("Patil");
		stack.push("091");
		
		String pop = stack.pop();
		System.out.println(pop);
		String peek = stack.peek();
		System.out.println(peek);
		
	}
}

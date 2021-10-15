package Stack;

public class PersonStack {
	private Person[] stack;
	private int top;
	private int size;
	
	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person[50];
	}
	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[this.size];
	}
	
	public boolean push(Person p) {
		top++;
		stack[top] = p;
		return true;
	}
	
	public Person pop() {
		return stack[top--]; 
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}

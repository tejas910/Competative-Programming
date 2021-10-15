package Stack;
//Implement Stack using array
public class MainStackArray {
	private int[] stack;
	private int top;
	private int size;
	
	MainStackArray(){
		top = -1;
		size = 50;
		stack = new int[50];
	}
	MainStackArray(int size){
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	public boolean push(int item) {
		top++;
		stack[top]=item;
		return true;
	}
	
	public int pop() {
		return stack[top--];
	}
	public boolean isEmpty() {
		return top==-1;
	}
}

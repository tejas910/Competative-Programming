package Queue;

//Implement Queue using array
public class MainQueue1 {
	private int[] q;
	private int rear;
	private int front;
	private int size;
	private int total;
	
	public MainQueue1() {
		total = 0;
		rear  = 0;
		front = 0;
		size = 5;
		q = new int[size];
	}
	public MainQueue1(int size) {
		total = 0;
		rear  = 0;
		front = 0;
		this.size = size;
		q = new int[this.size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			return false;
		}
		else {
			total++;
			q[rear] = item;
			rear = (rear+1)%size;
			return true;
		}
	}
	
	public int pop() {
		int item = q[front];
		total--;
		front = (front+1)%size;
		return item;
	}
	
	public boolean isFull() {
		if(size == total) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

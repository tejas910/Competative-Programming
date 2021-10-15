package Queue;

//import java.util.Collections;
//import java.util.PriorityQueue;

public class QueueImpl {
	public static void main(String[] args) throws Exception{
//		MainQueue<Integer> q = new MainQueue<>();
//		q.enqueue(12);
//		q.enqueue(2);
//		q.enqueue(44);
//		int pop = q.dequeue();
//		System.out.println(pop);
//		PriorityQueue<Integer> q = new PriorityQueue<>();
//		q.add(9);
//		q.add(22);
//		q.add(13);
//		q.add(34);
//		q.add(20);
//		System.out.println(q.contains(34));
//		int max = Collections.max(q);
//		 q.remove(max);
//		System.out.println(max);
//		max = Collections.max(q);
//		 q.remove(max);
//		System.out.println(max);
		
		MainQueue1 q = new MainQueue1();
		q.push(12);
		q.push(2);
		q.push(34);
		q.push(11);
		q.push(59);
		q.push(33);
		System.out.println(q.pop());

 	}
}

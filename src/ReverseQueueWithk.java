
import java.util.*;
public class ReverseQueueWithk {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
       q.add(33);
       q.add(23);
       q.add(3);
       q.add(13);
       q.add(5);
       int k=2;
       Stack<Integer> st =new Stack<>();
       for(int i=0;i<k;i++) {
    	   	st.push(q.poll());
       }
       q.add(st.pop());
       q.add(st.pop());
       
       System.out.print(q);
       
	}
}

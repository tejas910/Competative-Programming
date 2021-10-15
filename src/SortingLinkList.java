import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class SortingLinkList {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();

//		Stack<Integer> s = new Stack<>();
//		s.add(23);
//		s.add(223);
//		s.add(6);
//		System.out.println(s.search(223));
		li.add(5);
		li.add(44);
		li.add(-2);
		li.add(1);
		li.add(4);
		
		Collections.sort(li);
		System.out.println(li);
	}
}

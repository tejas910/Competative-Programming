package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListImple {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		List<Integer> li1 = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		getDif(li1);
		getDif(list);
		
		
	}
	static void getDif(List<Integer> li) {
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			li.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
}	

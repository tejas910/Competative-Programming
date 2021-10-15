import java.util.*;
public class NextLargerElement {
	public static void main(String[] args) {
		long arr[] = {10,3,12,4,2,9,13,0,8,11,1,7,5,6};
		List<Integer> li = new ArrayList<>();
		List<Integer> li1 = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			li1.add((int) arr[i]); 
		}
		int max = Collections.max(li1);
		int maxpos=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				maxpos = i;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
			  if(arr[i]<arr[i+1]) {
				li.add((int) arr[i+1]);
			   }
			  else if(i<maxpos) {
				  li.add((int) arr[maxpos]);
			  }
			  else {
				  li.add(-1);
			  }
			}
			else {
				li.add(-1);
			}
		}
		for(int a:li) {
			System.out.print(a+" ");
		}
	}
}

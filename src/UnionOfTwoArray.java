import java.util.*;
public class UnionOfTwoArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int brr[] = {1,2,3};
		
		HashSet<Integer> h = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		for(int i=0;i<brr.length;i++) {
			h.add(brr[i]);
		}
		System.out.println(h.size());
  }
}

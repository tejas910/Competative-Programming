import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MergeArray {
	public static void main(String[] args) {
		int arr[] = {4,0,2,1,3};
		int arr1[] = {2,7,9,8};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		Collections.sort(list);
		int arr2[] = new int[list.size()];

		for(int j=0;j<arr2.length;j++) {
			arr2[j] = list.get(j);
		}
	
	}
}

import java.util.ArrayList;
import java.util.List;

public class FindSumOfSubarray {
	public static void main(String[] args) {
		int arr[] = {1,2,4,-2,9};
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
//					li.add(arr[k]);
					System.out.print(arr[k]+" ");
				}
			}
		}
		for(int a:li) {
			System.out.println(a);
		}
		
	}
}

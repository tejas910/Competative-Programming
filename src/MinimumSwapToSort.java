import java.util.Arrays;

public class MinimumSwapToSort {
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,3};
		int arr1[] = {1,2,3,4,5};
		System.out.println(arr.equals(arr1));
		int len = arr.length-1;
		int c = 0;
		int max = Arrays.stream(arr).max().getAsInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max && i<=arr.length-2) {
				int temp = arr[i];
				arr[i] =arr[len];
				arr[len]=temp;
				c=c+1;
			}
		}
		System.out.println(c);
		
	}
}

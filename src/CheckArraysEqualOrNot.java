import java.util.Arrays;

public class CheckArraysEqualOrNot {
	public static void main(String[] args) {
		long arr[] = {1,3,5,4,2};
		long arr1[] = {4,5,2,1,3};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		boolean  st = Arrays.equals(arr, arr1);
		System.out.println(st);
	}
}

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {
		char arr[] = {'#','%','@'};
		char arr1[] = new char[3];
		int arr2[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=(int)arr[i];

		}
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr2);
			System.out.print(arr2[i]+" ");
			arr1[i]= (char) arr2[i];
			System.out.print(arr1[i]+" ");
		}
		
	}
}

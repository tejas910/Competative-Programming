import java.util.Arrays;

public class CheckArrayEqual {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int brr[] = new int[3];
//		
//		for(int i=0;i<arr.length;i++) {
//				if(arr[i]==arr[i]) {
//					System.out.println("1");
//				}
//				else {
//					System.out.println("0");
//				}
//			
//		}
		int m=0;
		int k = arr.length-1;
		for(int i=k;i>=2;i++) {
			brr[m] = arr[i];
			m++;
		}
		for(int j=0;j<brr.length;j++) {
			System.out.println(brr[j]);
		}
	}
}


public class CountNumbersOfOccurance {
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,3};
		int arr1[] = new int[5];
		int k=0;
		int m=1;
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					arr1[k]=m++;
				}
			}
			m=1;
			k++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
	}
}

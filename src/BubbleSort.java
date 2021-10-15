import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter The array to sort");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]= tmp;
				}
			}
		}
		System.out.println("Here is your sorted array");
		for(int arr1:arr) {
			System.out.println(arr1);
		}

	}

}

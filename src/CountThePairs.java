import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CountThePairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		Integer arr1[] = new Integer[n];
		int x = 10;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the element of"+" "+i);
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print("Enter the element of"+" "+i);
			arr1[i] = sc.nextInt();
		}

		LinkedList<Integer> li = new LinkedList<>(Arrays.asList(arr)); 
		LinkedList<Integer> li1 = new LinkedList<>(Arrays.asList(arr1)); 
		
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<li1.size();j++) {
				if(x==li.get(i)+li1.get(j)) {
					count++;
				}
			}
		}
		System.out.println("count ="+count);
	}
}

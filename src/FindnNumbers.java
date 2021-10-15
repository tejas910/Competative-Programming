import java.util.*;
public class FindnNumbers {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the N to get the sum");
			int n = sc.nextInt();
			int result = sum(n);
			System.out.println("Result of sum of N numbers: "+result);
		}
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n + sum(n-1);
	}
}

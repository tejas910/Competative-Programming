package Recursion;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
//		System.out.println(sum(5));
//		System.out.println(power(3, 5));
//		System.out.println(path(2, 2));
//		
//		int a[][] =  {{1,1,1,1,1},
//				{2,2,1,2,2},
//				{2,2,1,2,2},
//				{1,1,2,2,2}};
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[0].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		floodFill(a, 1, 1, 3, 2);
//		printMatrix(a);
		permutations("abc", 0, 2);
	}
	
	//Sum of n Natural Numbers
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	//
	static int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a*power(a, b-1);
	}
	static int fastPow(int m, int n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return fastPow(m*m , n/2);
		}
		return fastPow(m, n-1);
	}
	static int path(int a , int b) {
		if(a==1 || b==1) {
			return 1;
		}
		return path(a,b-1)+ path(a-1,b);
	}
	static void floodFill(int a[][], int r, int c , int toFill, int prevFill) {
		int rows = a.length;
		int cols = a[0].length;
		if(r<0 || r >= rows || c < 0 || c >= cols) {
			return;
		}
		if(a[r][c]!=prevFill) {
			return;
		}
		a[r][c]  = toFill;
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
	}
	public static void printMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void permutations(String s , int l ,int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s = interchangeOfChar(s, l , r);
			permutations(s, l+1, r);
			s = interchangeOfChar(s, l, r);
		}
	}
	static String interchangeOfChar(String s, int a, int b) {
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
	
}

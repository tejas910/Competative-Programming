import java.util.Scanner;

public class AverageMarksOfStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] marks = new int[n];
		int avg = 0;
		int sum = 0;
		for(int i =0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
 		}
		for(int i=0;i<marks.length;i++) {
			  sum = sum + marks[i];
			 
		}
		avg = sum/n;
		System.out.println(avg);
		
	} 
}

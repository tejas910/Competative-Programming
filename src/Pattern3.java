import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<rows-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


public class Pattern4 {
	public static void main(String[] args) {
		int rows=5;
		int cols=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(j<=i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

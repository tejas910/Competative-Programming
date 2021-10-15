
public class Pattern {
	public static void main(String[] args) {
		int rows=6;
		int cols=4;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(i==1 && j==2 || i==4 && j==3 || j==1 || j==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

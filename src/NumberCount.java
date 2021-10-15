import java.util.Scanner;

public class NumberCount {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int count;
	  count  = (int)Math.log10(n)+1;
	  System.out.println(count);
  }
}

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
//	   Scanner sc = new  Scanner(System.in);
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int temp = n;
//	   int temp[] = {12345,231,4212};
	  
	   int sum = 0;
//	  for(int i=0;i<temp.length;i++) {  
	   while(temp>0) {
		    int lastdigit = temp%10;
		    temp /=10;
		    sum += lastdigit;
		    
	   }
	   System.out.println(sum);
//	  }
  }
}

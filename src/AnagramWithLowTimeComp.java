import java.util.Arrays;
import java.util.Scanner;

public class AnagramWithLowTimeComp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String ");
		String a = sc.nextLine();
		System.out.println("Enter the Second String");
		String b = sc.nextLine();
		boolean isAnagram=false;
	    char chararray1[] = a.toCharArray();
	    char chararray2[] = b.toCharArray();
	     Arrays.sort(chararray1);
	     Arrays.sort(chararray2);
	     if(a.length()==b.length()) {
	    	 for(int i=0;i<a.length();i++) {
	    		 for(int j=0;j<=b.length();j++) {
	    		 if(b.charAt(j)==a.charAt(i)) {
	    			 isAnagram = true;
	    			 break;
	    		   }
	    		 }
	    		 if(!isAnagram) {
	    			 break;
	    		 }
	    	 }
	     }
	     if(isAnagram) {
	    	 System.out.println("Anagram");
	     }
	     else {
	    	 System.out.println("Not Anagram");
	     }
	}
}

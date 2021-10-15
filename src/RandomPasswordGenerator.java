import java.util.*;
public class RandomPasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Password");
		int n = sc.nextInt();
		System.out.println(passwordGenerator(n));
		System.out.println(otpGenerator(4));
	}
	static String passwordGenerator(int len) {
		 String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	     String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
	     String numbers = "0123456789"; 
	     String symbols = "!@#$%^&*_=+-/.?<>)";
	     String values = Capital_chars+Small_chars+numbers+symbols;
	     Random rndm_method = new Random(); 
	     char[] password = new char[len]; 
	     for(int i=0;i<len;i++) {
	    	 password[i] = values.charAt(rndm_method.nextInt(values.length()));
	     }
	     return String.valueOf(password);
	  }
	
	static String otpGenerator(int n) {
		String numbers = "1234567890";
		Random rand = new Random();
		char[] otp = new char[n];
		for(int i=0;i<n;i++) {
			otp[i] = numbers.charAt(rand.nextInt(numbers.length()));
		}
		return String.valueOf(otp);
	}
	
}
//^T=r3V@PDM
//AkIv$+SA@f 


public class SumOfNum {	
	public static void main(String[] args) {
		String str = "35";
		int sum =0;
		for(int i=1;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum+str.charAt(i);
			}
			
		}
		System.out.println(sum);
	}
}

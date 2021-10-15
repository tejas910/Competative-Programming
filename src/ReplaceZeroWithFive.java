
public class ReplaceZeroWithFive {
	public static void main(String[] args) {
		int num = 1002;
		String str = String.valueOf(num);
		char c[] = new char[str.length()];
		c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='0') {
				c[i]=5;
			}
			
		}
		String str2 = String.valueOf(c);
		int num1 = Integer.parseInt(str2);
		System.out.println(num1);
	}
}

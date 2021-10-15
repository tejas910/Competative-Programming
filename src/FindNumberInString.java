
public class FindNumberInString {
	public static void main(String[] args) {
		String str = "1Tejas91";
		char c[] = str.toCharArray();
		StringBuilder sum = new StringBuilder();
		for(int i=0;i<c.length;i++) {
		 if(Character.isDigit(c[i])) {
			 sum.append(c[i]);
		 }
		}
		System.out.println(sum);
	}
}	

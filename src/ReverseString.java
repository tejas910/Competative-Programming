
public class ReverseString {
	public static void main(String[] args) {
		String str = "Tejas";
		char a[] = new char[5];
		char c[] = str.toCharArray();
		int j=0;
		for(int i = c.length-1;i>=0;i--) {
			a[j++]=c[i];
			
		}
		String str2 = new String(a);
		System.out.println(str2);
	}
}

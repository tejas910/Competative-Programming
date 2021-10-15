
public class FirstLetterGet {
	public static void main(String[] args) {
		String str = "Tejas Pramod Patil";
		char a[] = str.toCharArray();
		int n = str.length();
		char arr[] = new char[n];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i==0 || a[i]==' ') {
				if(i==0) {
					arr[j++]=a[i];
				}
				else {
					arr[j++]=a[i+1];
				}
			}
		}
		String str1 = new String(arr);
		System.out.println(str1);
	}
}

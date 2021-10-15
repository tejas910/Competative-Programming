
public class ExtraElementIndex {
	public static void main(String[] args) {
		int a[] = {2,4,6,8,10,12};
		int b[] = {2,4,6,8,10,12,13};
		int c=0;
		for(int i=0;i<a.length;i++) {
			
				if(a[i]!=b[i]) {
				  c=i;
				  break;
				}
			
		}
		System.out.println(c);
	}
}

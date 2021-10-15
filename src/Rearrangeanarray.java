
public class Rearrangeanarray {
	public static void main(String[] args) {
		int arr[] = {4,0,2,1,3};
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
		
			arr[i]=arr2[arr2[i]];
			
		}
		for(int a:arr) {
			System.out.println(a);
		}
	
	}

}

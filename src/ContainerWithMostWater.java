
public class ContainerWithMostWater {
	public static void main(String[] args) {
		int arr[]  = {3,1,2,4,5};
		int arr1[] = new int[2];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5 || arr[i]==3){
                arr1[k++] = i;
            }
        }
        k=0;
        int dif = Math.abs(arr1[k]-arr1[k+1]);
        int ans = 3*dif;
        System.out.println(ans);
	}
}

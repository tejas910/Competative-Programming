import java.util.*;
import java.lang.*;
import java.io.*;
public class LargestSumArray {
	public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=1;i<=testcase;i++){
            int arrlen = sc.nextInt();
            int arr[] = new int[arrlen];
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt(); 
            }
            List<Integer> arrlist = new ArrayList<>();
            List<Integer> arrlist1 = new ArrayList<>();
            for(int k=0;k<arr.length;k++){
                for(int l=0;l<arr.length;l++){
                    if(arr[l]>=0){
                     arrlist.add(arr[l]);
                    }
                    else{
                    	
                        arrlist.clear();
                    }
                }
                
                
            }
            	int arr2[] = new int[arrlist.size()];
            	 Object[] objects = arrlist.toArray(); 
       	      for(int f=0;f<objects.length;f++) {
       	    	  arr2[f] = (int)objects[f];
       	      }
       	      for(int a:arr2) {
       	    	  System.out.println(a);
       	      }

        }
    }
}

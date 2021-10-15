
import java.util.*;
import java.lang.*;
import java.io.*;

class CFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testcase = sc.nextInt();
	    for(int i=1;i<=testcase;i++){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int j=0;j<arr.length;j++){
	            arr[j] = sc.nextInt();
	        }
	        List<Integer> arr1 = new ArrayList<>();
	        List<Integer> arrlength = new ArrayList<>();
	        
	        for(int m=0;m<arr.length;m++){
	           // System.out.print(a+" ");
       			arr1.add(arr[m]);
       		
	        if(arr[m] > 0)
            {
            	for(int k=m;k<arr.length-1;k++) {
            		if(arr[k+1]>0) {
            	
            			arr1.add(arr[k+1]);
            		}
            		else {
            			
            			break;
            		}
            	}
    			arrlength.add(arr1.size());
            }
            
            arr1.clear();
	      }
//	      System.out.println(arrlength);
//	      System.out.println( Collections.max(arrlength)); 
//	      int arr3[] = new int[arrlength.size()];
//	      Object[] objects = arrlength.toArray(); 
//	      for(int f=0;f<objects.length;f++) {
//	    	  arr3[f] = (int)objects[f];
//	      }
	      int temp=0;
	      for(int a:arrlength) {
	    	  if(temp<a) {
	    		  temp=a;
	    	  }
	      }
	      System.out.println(temp);
//	      Arrays.sort(objects);
//	      int t = objects.length-1;
//	      System.out.println(objects[t]);
//	     

	      
	    }
	}
}
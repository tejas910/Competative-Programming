package staticpackage;

import java.util.ArrayList;
import java.util.Collections;


public class Sample{ 
	public static void main(String[] args) {
		int arr[] = {1,4};
		int sum = 0;
		int n =3;

		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		if((sum%n)==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}

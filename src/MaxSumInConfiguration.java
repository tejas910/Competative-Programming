import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxSumInConfiguration {
	public static void main(String[] args) {
		int arr[] = {887,778,916,794,336,387,493,650,422,363,28,691,60,764,927,541,427,173,737,212,369,568,430,783,531,863,124,68,136,930,803,23,59,70,168,394,457,12,43,230,374,422,920,785,538,199,325,316,371,414,527,92,981,957,874,863,171,997,282,306,926,85,328,337,506,847,730,314,858,125,896,583,546,815,368,435,365,44,751,88,809,277,179,789};
//		int arr[]= {8,3,1,2};
		long sum = 0;
		List<Integer> list = new ArrayList<>();
		List<Long> list1 = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
//		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			Collections.rotate(list, i);
			sum=0;	
			for(int j=0;j<list.size();j++) {
				sum = sum+(list.get(j)*j);
			}
			list1.add(sum);
		}
		for(long a:list1) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(Collections.max(list1));
		
	}
}	

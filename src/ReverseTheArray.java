import java.util.*;

public class ReverseTheArray {
	public static void main(String[] args) {
//		int arr[] = { 887, 778, 916, 794, 336, 387, 493, 650, 422, 363, 28, 691, 60, 764, 927, 541, 427, 173, 737, 212,
//				369, 568, 430, 783, 531, 863, 124, 68, 136, 930, 803, 23, 59, 70, 168, 394, 457, 12, 43, 230, 374, 422,
//				920, 785, 538, 199, 325, 316, 371, 414, 527, 92, 981, 957, 874, 863, 171, 997, 282, 306, 926, 85, 328,
//				337, 506, 847, 730, 314, 858, 125, 896, 583, 546, 815, 368, 435, 365, 44, 751, 88, 809, 277, 179, 789 };

		int arr[] = {1,2,3,4,5};
		List<Long> li = new ArrayList<>();
		List<Long> li1 = new ArrayList<>();
		Long sum = (long) 0;
		for (int i = 0; i < arr.length; i++) {
			li.add((long)arr[i]);
		}
		for (int i = 0; i < li.size(); i++) {
			Collections.rotate(li, i);
			System.out.println(li);
			sum = (long)0;
			for (int j = 0; j < li.size(); j++) {
				sum = sum + (li.get(j) * j);
			}
			li1.add(sum);

		}

		System.out.println(Collections.max(li1));

//,,,,,,,,List<Integer>,li,=,new,ArrayList<>(Arrays.asList((Integer)arr));
//,,,,,,,,for(Integer,a:li),{
//,,,,,,,,	System.out.println(a);
//,,,,,,,,}
//		System.out.println(arr.length);
//		for(int,i=2;i<arr.length;i++),{
//			System.out.println(arr[i]);
//			if(arr[i]==arr.length),{
//				for(int,j=0;j<2;j++),{
//					System.out.println(arr[j]);
//				}
//			}
//
//			
//		}
	}
}

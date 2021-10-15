import java.util.Scanner;

public class Anagram1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String a=sc.nextLine();
		System.out.println("Enter the second String");
		String b=sc.nextLine();
		int al[]=new int[256];
		int bl[]=new int[256];
		boolean isAnagram = true;
		for(char f:a.toCharArray()) {
			int index = (int) f;
			al[index]++;
		}
		for(char k:b.toCharArray()) {
			int index = (int) k;
			bl[index]++;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=bl[i]) {
				isAnagram=false;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}

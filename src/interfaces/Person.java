package interfaces;

public class Person implements Student,Youtuber {
	public static void main(String[] args) {
		
	}

	@Override
	public void study() {
		System.out.println("Person is Studying");
		
	}

	@Override
	public void makeYoutube() {
		System.out.println("Person is making video");
		
	}
}

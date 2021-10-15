package staticpackage;

public class Staticex {
	static int i;
	static {	
		System.out.println("in static block 1");
	}
	Staticex(){
		System.out.println("in constructor");
	}
	static {	
		System.out.println("in static block 2");
	}


	public static void main(String[] args) {
//			Staticex w = new Staticex();
			StaticKeyword.add();
			System.out.println("in main function") ;
	}
}

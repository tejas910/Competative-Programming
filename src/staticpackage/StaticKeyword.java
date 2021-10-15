package staticpackage;

public class StaticKeyword {
	
    class Person{
		int age;
		String name;
		final static String breed = "Homo Sapiens";
	}
	public static void add() {
		System.out.println("in another class");
	}
}

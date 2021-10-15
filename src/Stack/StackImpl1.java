package Stack;

public class StackImpl1 {
	public static void main(String[] args) {
//		MainStackArray st = new MainStackArray();
//		st.push(2);
//		st.push(13);
//		st.push(48);
//		st.push(92);
//		st.push(4);
//		
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		
		Person p  = new Person("Tejas","101");
		Person p1  = new Person("Yash","201");
		PersonStack ps = new PersonStack();
		ps.push(p1);
		ps.push(p);
		System.out.println(ps.pop());
		System.out.println(ps.pop());

	}
}

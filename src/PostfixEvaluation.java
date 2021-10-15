import java.util.*;
public class PostfixEvaluation {
	public static void main(String[] args) {
		String str = "231*+9-";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch !='/'|| ch!='*'|| ch!='+'|| ch!='-') {
			  	st.push(ch);
			}
			if(ch =='/'|| ch=='*'|| ch=='+'|| ch=='-') {
//			  	int k = Integer.parseInt(st.pop((ch)));
			}
			

		}
	}
}	

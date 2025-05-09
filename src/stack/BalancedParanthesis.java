package stack;
import java.util.Stack;
public class BalancedParanthesis {

	static boolean check(String str) {
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			if(curr=='{' ||curr=='[' ||curr=='(')
				s.push(curr);
			else
			{
				if(s.isEmpty())
					return false;
				else if(isMatching(s.peek(),curr))
					s.pop();
				else 
					return false;
			}
		}
		return (s.isEmpty());
	}
	
	private static boolean isMatching(char left, char right) {
		
		return (left=='{' && right=='}')
				|| (left=='[' && right==']')
				|| (left=='(' && right==')');
	}

	public static void main(String[] args) {
		String s = "[()]";
		System.out.println(check(s));
	}

}

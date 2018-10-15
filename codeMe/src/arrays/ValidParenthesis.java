package arrays;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// String input= "{}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}";
		// String input= "{{{{{{{{{{{{{{{{{{{{{{{{{{{}";
		String input = "}{}";
		ValidParenthesis  obj = new ValidParenthesis();
		obj.countValidPatenthesis(input);
		
	}
	
	void countValidPatenthesis(String input) {

		Stack<Character> par = new Stack<Character>();

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			par.push(input.charAt(i));
		}

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{' && par.pop() == '}') {
				count++;
			}
		}
		System.out.println(count * 2);
	}
}

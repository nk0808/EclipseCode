package arrays;

import java.util.Iterator;
import java.util.Stack;

public class NoOfBlancedParenthesis {

	public static void main(String[] args) {

		// String input= "{}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}";

		//String input = "{}{}";
		NoOfBlancedParenthesis obj = new NoOfBlancedParenthesis();
		//int res=
				obj.doCode(")()()");
		
		//System.out.println(res);
	}
	
	public static void doCode(String sen) {

		int i = 0;
		int count = 0;

		Stack stack = new Stack();
		char[] ch = sen.toCharArray();
		int length = ch.length-1;

		while (i < length) {
			
			//Checking that next parentheses are closing 
			//parentheses,if yes then push the opening parentheses.
			//if opening parentheses is at the last position of the 
			// string then dont push into the stack.
                 
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				if (i < length - 1) {
					if (isEqual(ch[i], ch[i + 1])) {
						stack.push(ch[i]);
					}
				}
			}
  
			//Checking that previous parentheses is opening 
			//parentheses or not. If Yes then push the closing 
			//parentheses into the stack.
			
			if (ch[i] == ')' || ch[i] == '}' | ch[i] == ']') {

				if (isEqual(ch[i - 1], ch[i])) {
					stack.push(ch[i]);

				}
			}
			i++;
		} // while loop end.

		//printing all elements one by one into the stack.
		System.out.println("Printing balanced parentheses are: ");
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			count++;
			System.out.print(itr.next());
		}
		System.out.println();
		//Counting total number of parentheses here.
		System.out.println("Total no. of Balanced"
				+ " parentheses are: " + count / 2);
	}

	public static boolean isEqual(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')') {
			return true;
		} else if (ch1 == '{' && ch2 == '}') {
			return true;
		} else if (ch1 == '[' && ch2 == ']') {
			return true;
		} else {
			return false;
		}

	}// end isEqual method.

}
	
	//==========
	/* int doCode(String input) {
		int open = 0;
	      int count =0;

	     for(int i=0;i<input.length();i++){
	        if(input.charAt(i)=='('){
	        open--;
	        }else if(input.charAt(i)==')'){
	         open++;
	        }
	        if(open<0){
	        count++;
	        open++;
	     }
	  }
	  return count+open;
		
	 }*/
		
		//===============

		/*int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(')
				counter++;
			else if (input.charAt(i) == ')')
				counter--;

			if (counter < 0)
				break;
			System.out.println(counter);
		}
		

		if (counter != 0) {
			// error();
			System.out.println("Error");
		}
*/
		// String input = "}{";

		/*
		 * Stack<Character> par = new Stack<Character>();
		 * 
		 * int count = 0;
		 * 
		 * 
		 * for (int i = 0; i < input.length(); i++) { par.push(input.charAt(i)); }
		 * 
		 * for (int i = 0; i < input.length(); i++) { if (input.charAt(i) == '{' &
		 * par.pop() == '}') { count++; } } System.out.println(count * 2); }
		 */
	

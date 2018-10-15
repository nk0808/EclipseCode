package arrays;

public class NumberCompression {

	public static void main(String[] args) {
		NumberCompression obj= new NumberCompression();
		//String res =
				obj.doCompression("2111222");
		
		//System.out.println(res);
	}
	void doCompression(String str) {
		int count=1;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else if(str.charAt(i) != str.charAt(i-1) || (str.charAt(i) == str.charAt(str.length()-1) )){
				System.out.print(count+ ""+ str.charAt(i-1) + " ");
				count=1;
				
			}
		}
		
	}
}

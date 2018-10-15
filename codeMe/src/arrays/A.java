package arrays;

public class A {

	public static void main(String[] args) {
	A o= new A();
	int r= o.methodRet();
	System.out.println(r);
}

	static int methodRet() {
		try {
			return 10;
		}
		catch (Exception e) {
			return 20;
		}
		finally{
			return 30;
		}
	}
}	

package arrays;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List1 obj = new List1();
		obj.m1();
	}

	void m1() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);

		for (Integer x : l) {
			if (x == 2) {
				l.remove(x);
			}
			System.out.println(x);
		}
	}

}

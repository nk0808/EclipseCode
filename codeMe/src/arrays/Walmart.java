package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Walmart implements Comparator<String> {
	public static void main(String[] args) {

		Walmart obj = new Walmart();
		String input = "walmart";
		
		if (input == null) {
			System.out.println("Null input");
		}

		ArrayList<String> inp = new ArrayList<String>();
		ArrayList<String> out = new ArrayList<String>();

		int prev = 1;

		for (int i = 1; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				int a= input.substring(prev, j).length();
				String b=input.substring(j);
				out.add(input.substring(0, prev) + "" + a + "" + b);
				inp.add(input.substring(prev, j));
			}
			prev++;
		}
		Collections.sort(out, obj);
		System.out.println(out);
	}

	@Override
	// Using comparator to sort
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();

	}

}

package arrays;

public class StringBufferProb {
	
	public static void main(String[] args) {
		StringBufferProb obj = new StringBufferProb();
		obj.printCount("2");
	}
	public void printCount(String str) {
		char[] arr = str.toCharArray();
		if (arr.length == 1) {
			System.out.println(1 + str);
			return;
		}

		int count = 1;

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count += 1;
			} else {
				sb.append(count);
				sb.append(arr[i - 1]);
				count = 1;
			}
		}

		sb.append(count);
		sb.append(arr[arr.length - 1]);
		System.out.println(sb.toString());

	}

}

package Armstrong.java;

public class ArgsP {
	public static void main(String[] args) {
		int count = 0;
		for (char c = 'a'; c <= 'z'; c++) {

			for (String string : args) {

				for (int i = 0; i < string.length(); i++) {

					if (string.charAt(i) == c) {
						count++;

					}
				}

			}
			System.out.println(c + " = " + count);

			count = 0;

		}

	}
}
package assignments;

public class Challenge1 {

	public static void main(String[] args) {
		String name = "Hello World";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] ==' ') {
				System.out.println(charArray.length-6);
			}
		}
	}
}
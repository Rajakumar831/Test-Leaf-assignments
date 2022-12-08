package assignments;

public class Challenge3 {

	public static void main(String[] args) {
		// Given a string s, return true if it is a palindrome, or false otherwise.
		String text = "Sky limit";
		char[] chararray = text.toCharArray();
		String revtext = " ";
		for (int i = chararray.length-1 ; i >=0; i--){
			revtext = revtext + chararray [i];
		}
		System.out.println(revtext);
		if (text.equals(revtext))
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
	}
}
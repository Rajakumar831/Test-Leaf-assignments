package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "rajakumar";
		char[] testArray =  test.toCharArray();

		for (int i = 0; i < testArray.length; i++) {
			if(i % 2 != 0)
			{
				System.out.println(Character.toUpperCase(testArray[i]));
			}
			else
			{
				System.out.println(testArray[i]);
			}		

		}
	}
}

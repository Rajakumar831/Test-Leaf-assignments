package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Rohith Sarran";
		char[] namearray =name.toCharArray();
		for (int i = namearray.length-1; i >=0 ; i--) {
			System.out.print(namearray[i]);

		}

	}

}



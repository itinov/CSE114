package Labs.Lab10;


public class RecursiveOccurrencesOfCharacter {
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, 0);
	}
	public static int count(char[] chars, char ch, int high) {
		if(high==chars.length)
			return 0;
		return count(chars, ch, high+1) + (chars[high]==ch ? 1 : 0);
	}

	public static void main(String[] args) {
		System.out.println("There are " + count(new char[]{'a','b','a','a','c'},('a')) + " occurrences of the specified character.");

	}

}

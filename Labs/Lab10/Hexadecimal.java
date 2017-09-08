package Labs.Lab10;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #10
 */
import java.util.Scanner;

class HexFormatException extends Exception { }

public class Hexadecimal {

	public static int parseHex(String hex) throws HexFormatException {
		int d = 0;
		for(int i=0;i<hex.length();i++) {
			d = d * 16 + parseHexDigit(hex.charAt(i));
		}
		return d;
	}
	
	public static int parseHexDigit(char h) throws HexFormatException {
		if('0'<=h && h<='9')
			return h-'0';
		if('a'<=h && h<='f')
			return h-'a'+10;
		if('A'<=h && h<='F')
			return h-'A'+10;
		throw new HexFormatException();
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hexadecimal value: ");
		String hexValue = input.next();
		try {
			System.out.println("Hexadecimal " + hexValue + " is " + parseHex(hexValue) + " in decimal.");
		} catch(HexFormatException e) {
			System.out.println("This is not a hexadecimal number.");
		}

	}

}

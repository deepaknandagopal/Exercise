package coreJava_Strings;

import java.util.Scanner;

public class StirngMethods {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the word");
		String word = in.nextLine();
		System.out.println("Length of the word entered is "+word.length());
		System.out.println("Second Character in the word entered is "+word.charAt(1));
		System.out.println("Enter the another word to check equal");
		String anotherWord = in.nextLine();
		System.out.println(word.equals(anotherWord) ? "Equals": "Not Equals");
		System.out.println("Enter the another word to check equal with case ignored");
		String anotherWord1 = in.nextLine();
		System.out.println(word.equalsIgnoreCase(anotherWord1) ? "Equals": "Not Equals");
		System.out.println("\nWord Starts with dee : "+word.startsWith("dee"));
		System.out.println("Word ends with pak : "+word.endsWith("pak"));
		String[] arr = word.split(" ");
		System.out.println(arr[0]);
		System.out.println("\nThe Trimmed word is: "+word.trim());
		System.out.println("Uppercase: "+word.toUpperCase()+"Lowercase: " + word.toLowerCase());
		System.out.println(word.indexOf('d'));
		System.out.println(word.substring(3, 5));
		in.close();
	}

}

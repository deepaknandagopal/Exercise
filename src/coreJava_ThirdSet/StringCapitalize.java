package coreJava_ThirdSet;

import java.util.Scanner;

public class StringCapitalize {

	public static void Capitalize(String inputString){
		String[] arr = inputString.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		System.out.println(sb);
	}

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		Capitalize(inputString);
		in.close();
	}
	
}

package coreJava_ThirdSet;

import java.util.Scanner;

public class HexaDecimalConversion {
	
	public static int hexValue(char character)
	{	
		switch(character)
		{
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 10;
		case 'D':
			return 11;
		case 'E':
			return 10;
		case 'F':
			return 11;
		default:
			return 0;
		}
		
	}
	
	private static boolean isNumeric(String cadena) {
	    if ( cadena.length() == 0 || 
	         (cadena.charAt(0) != '-' && Character.digit(cadena.charAt(0), 16) == -1))
	        return false;
	    if ( cadena.length() == 1 && cadena.charAt(0) == '-' )
	        return false;
	    for ( int i = 1 ; i < cadena.length() ; i++ )
	        if ( Character.digit(cadena.charAt(i), 16) == -1 )
	            return false;
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a HexaDecimal Digit");
		String hexadigit = in.nextLine();
		if(isNumeric(hexadigit))
		{
			
			int value = 0;
			for(int i=0;i<hexadigit.length();i++)
			{
				char character = Character.toUpperCase(hexadigit.charAt(i) );
				
				if(character == 'A' | character == 'B' | character == 'C' | 
						character == 'D' | character == 'E' | 
								character == 'F')
				{
					value = value*16 + hexValue(character);
				}
				else
				{
					value = value*16 +   Character.getNumericValue(hexadigit.charAt(i));
				}
			}
			System.out.println(value);
		}
		else
		{
			System.out.println("Please enter a proper HexaDecimal Digit next time");
		}
		
	}

}

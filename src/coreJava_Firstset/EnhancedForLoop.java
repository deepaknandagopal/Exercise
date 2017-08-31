package coreJava_Firstset;


/**
 * @author Deepak Kumar Nandagopal
 *
 * Program to demonstrate enhanced for loop.
 */
public class EnhancedForLoop {

	public static void main(String[] args) {
		int num[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			num[i] = i+1;
		}
		for(int number:num)
		{
			System.out.println(number);
		}
		
		String[] array = new String[2];
		array[0] = "For";
		array[1] = "Loop";
		
		for(String element:array)
		{
			System.out.println(element);
		}
	}

}

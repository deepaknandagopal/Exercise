package coreJava_Firstset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * @author Deepak Kumar Nandagopal
 * 
 * Program to find the duplicate key elements in the list
 */
public class ListDuplicates {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Kumar");  
		al.add("Vijay");  
		al.add("Kumar");
		al.add("Kumar");
		al.add("Vijay");  
		al.add("Deepak");  
		
		Collections.sort(al);
		// To populate the list
		ListIterator<String> itr=al.listIterator(); 
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		for(int i=0;i<al.size()-1;i++)
		{
			if(al.get(i).equals(al.get(i+1)))
			{
				System.out.println("duplicate List Item :"+al.get(i+1)+" At Index :"+(i+1) );
			}
		}
		
	}
}

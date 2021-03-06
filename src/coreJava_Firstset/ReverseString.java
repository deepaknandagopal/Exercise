package coreJava_Firstset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @author Deepak Kumar Nandagopal
 *
 * Java Program to reverse the String using String.equals(), String.charAt(), String.length().
 * Input from user is read in a loop until the user enters a string.
 */
public class ReverseString
{
  public ReverseString() {}
  
  public static void main(String[] args)
    throws IOException
  {
    Pattern pattern = Pattern.compile("^[A-Za-z, ]++$");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the String to reverse");
    String txt = br.readLine();
    while (!pattern.matcher(txt).matches())
    {
      System.out.println("Please enter a string to continue");
      txt = br.readLine();
    }
    String reversetxt = "";
    int length = txt.length() - 1;
    for (int i = 0; i < txt.length(); i++)
    {
      reversetxt = reversetxt + txt.charAt(length);
      length--;
    }
    System.out.println("The Reversed String is:");
    System.out.println(reversetxt);
  }
}
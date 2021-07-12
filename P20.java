/*20. Write a Java program to return the string after removing all 'z' (except the very first and last) from a given string.*/
import java.util.*;
public class P20
{
public String removeZ(String s)
 
{
  String s2 = "";
  int length = s.length();
  for (int i = 0; i < length; i++)
  {
    char r1 = s.charAt(i);
    if (!(i>0&&r1=='z'))
      s2 = s2 + r1;
  }
    return s2;     
}

public static void main (String a1[])
    {
      P20 p= new P20();
      String str1 =  "zebrazone";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+p.removeZ(str1));
	  }
}

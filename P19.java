/*19. Write a Java program to check whether the character immediately before and after of # is same in a given string.*/


import java.util.*;
public class P19
{
public boolean Hash(String s1) 
{
  int l = s1.length();
  boolean f1 = true;
  for (int i = 0; i < l; i++) 
  {
    
    if (s1.equals("#") ) 
	{
      if (s1.charAt(i-1) == s1.charAt(i+1))
        f1 = true;
      else
        f1 = false;
    }
  }
  return f1;
}
public static void main (String[] args)
    {
      P19 m= new P19();
      String m1 =  "moon#night";
      System.out.println("The given string is: "+m1);
      System.out.println("The before and after character are same: "+m.Hash(m1));
	  }
}

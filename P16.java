/*16. Write a Java program to remove duplicate characters from a given string presents in another given string.*/
import java.util.*;
public class P16 
{
 public static void main(String[] args) 
 {
  String s1 = "the quick brown fox";
  String s2 = "queen";
  System.out.println("The given string is: " + s1);
  System.out.println("The given mask string is: " + s2);
 
  System.out.println("\nThe new string is: ");
  for (int i = 0; i < s1.length(); i++)
	  {
		  char c=s2.charAt(i);
		 if(s1.contains(c))
		 {
			s1= s1.replace((c),"");
		 }
	  
    System.out.print(s1);
  }
 }
 }

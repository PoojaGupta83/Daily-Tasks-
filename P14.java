/*14. Write a Java program to find first non repeating character in a string.*/
import java.util.*;
public class P14 {
 public static void main(String[] args) {
  String s1 = "gibblegabbler";
  
  for (int i = 0; i < s1.length(); i++) {
   boolean nonr = true;
   for (int j = 0; j < s1.length(); j++) {
    if (i != j && s1.charAt(i) == s1.charAt(j)) {
     nonr = false;
     break;
    }
   }
   if (nonr)
	   {
    System.out.println("The first non repeated character in String is: " + s1.charAt(i));
    break;
   }
  }
 }
}
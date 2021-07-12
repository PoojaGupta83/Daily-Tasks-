/*Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.*/
import java.util.*;
class P9
{
public static void main(String s[])
{
String s1="The quick brown fox jumps over the lazy dog";

String s2=s1.replaceAll("fox","cat");
System.out.println("Original String:"+s1);
System.out.println("New String="+s2);
}
}
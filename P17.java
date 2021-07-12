/*17. Write a Java program to remove "b" and "ac" from a given string.*/
import java.util.*;
class P17
{
public static void main(String s[])
{
String s1="abrambabasc";
String t1=s1.replaceAll("ac","");
String t2=t1.replaceAll("b","");
System.out.println("The given string is="+s1);
System.out.println("After removing the new string is="+t2);
}
}
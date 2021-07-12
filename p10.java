/*10. Write a Java program to check whether a given string starts with the contents of another string. */
import java.util.*;
class P10
{
public static void main(String s[])
{
	String s1="Red is favorite color. ";
	String s2="Orange is also my favorite color.";
	boolean b1,b2;
	String s3="Red";
	b1=s1.startsWith(s3);
	b2=s2.startsWith(s3);
	System.out.println(s1+"starts with Red?"+" "+b1);
	System.out.println(s2+"starts with Red?"+" "+b2);
	
	
	
}
}
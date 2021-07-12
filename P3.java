/*Write a java program to compare two strings lexicographically.*/
import java.util.*;
class P3
{
public static void main(String s[])
{

String s1="This is Exercise 1  ";
String s2="This is Exercise 2  ";

int c=s1.compareTo(s2);
if(c<0)
{
System.out.println(" "+s1+"is less than "+ s2+" ");
}
else
{
if(c>0)
{
System.out.println(" "+s1+ "is greater than "+s2+ " ");

}

else
{
System.out.println(" "+s1+ "is equal to "+s2+" ");
}
}
}
}
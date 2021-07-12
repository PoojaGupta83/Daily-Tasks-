/*8. Write a Java program to create a unique identifier of a given string.*/
import java.util.*;
class P8
{
public static void main(String s[])
{
String s1="Python Exercises.";
int h1=s1.hashCode();
System.out.println("The hash for " +s1+" "+ "is"+" " +h1);
}
}
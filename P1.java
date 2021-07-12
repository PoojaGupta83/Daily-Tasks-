/*1. Write a Java program to get the character at the given index within the String.*/
import java.util.*;
class P1
{
public static void main(String s[])
{
int a,b;
String s1="Java Program One";
System.out.println("Enter the position");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Given String is:="+s1);
b=s1.charAt(a);
System.out.println("Character at Given Position="+(char)b);
}
}
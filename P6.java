/*6. Write a Java program to check whether a given string ends with the contents of another string.*/
import java.util.*;
class P6
{
public static void main(String s[])
{
String s1="Python Exercises";
String s2 = "Python Exercise";

String s3="se";
boolean b1,b2;
b1=s1.endsWith(s3);
b2=s2.endsWith(s3);

System.out.println("Python Exercises"+" ends with "+ " "+s3+" "+"?" + b1);
System.out.println("Python Exercise" +"ends with "+ " " +s3+" "+"?" +b2);
 

}
}
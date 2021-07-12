/*5. Write a Java program to create a new String object with the contents of a character array.*/
import java.util.*;
class P5
{
public static void main(String s[])
{
String s1="This is a Java Program";
char c1[]=s1.toCharArray();
for (char c2:c1)
{
System.out.println(c2);

}
}
}
/*2. Write a java program to count a number of Unicode code points in the specified text range of a String. */
import java.util.*;
import java.io.*;
class P2
{
	static void codecount(String s2)
	{
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		char c1[] = s2.toCharArray();
		int c3=0;

		for(char c2:c1)
		{
			if(h1.containsKey(c2))
			{
				h1.put(c2,h1.get(c2)+1);
			}
				 else {
                h1.put(c2, 1);
            }
        }
		// c3=c3+c2;
  
        
        for (Map.Entry entry : h1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
  
public static void main(String s[])
{
String s1="Java Program One";
codecount(s1);
int c3=s1.length();
System.out.println("Total Number of unicode count ="+c3);
}
}



/*4. WAP to count the frequency of appearence of each character in a given string.*/


import java.util.*;
import java.io.*;
class P4
{
	static void frequency(String s2)
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
		
  
        
        for (Map.Entry entry : h1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
  
public static void main(String s[])
{
String s1="AMAN";
frequency(s1);

}
}


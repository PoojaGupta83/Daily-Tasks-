/*7. Write a java program to print current date and time in the specified format.*/
import java.util.*;

class P7
{
public static void main(String s[])
{
	Calendar a1=Calendar.getInstance();
	System.out.println("Current Date and Time");
	System.out.format("%tB %te, %tY%n", a1, a1, a1);
      System.out.format("%tl:%tM %tp%n", a1, a1, a1); 
	

}
}
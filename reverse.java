
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=" ";
		int l=s1.length();
		for(int i=l-1;i>=0;i--)
		{
		    s2=s2+s1.charAt(i);
		}
		System.out.print(s2);
	}
}

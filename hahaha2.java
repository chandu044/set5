/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=1,c=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			if(i==n)
			{
				c=c+1;
			}
			i=i*2;
		}
		if(c==1)
		{
		        	System.out.print("yes");
			
		}
		else
		{
			System.out.print("no");
		}
	}
}

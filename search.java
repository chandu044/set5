/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,c=0;
		int[] a={1,2,3,4,5,6,7,8,9,10};
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				c=c+1;
			}
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

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int t=n;
		while(n!=0)
		{
			n=n/10;
			i=i+1;
		}
	//	if(t==0)
	//	{
	//		int j=1;
	//		System.out.print(j);
	//	}else
	//	{
		System.out.print(i);
	//	}
	}
}

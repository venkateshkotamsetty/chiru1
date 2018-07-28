/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int v, p = 1 ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        while(p <= v)
        {
            sum+= p;
            p++;
        }
        System.out.println(+sum);
    } 
		




	
}

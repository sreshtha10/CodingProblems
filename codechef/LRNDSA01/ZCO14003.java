/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    try{
	    	InputStreamReader r = new InputStreamReader(System.in);
	    	BufferedReader reader = new BufferedReader(r);
	    	int n = Integer.parseInt(reader.readLine());
	    	long[] elements  = new long[n];
	    	for(int i=0;i<n;i++) {
	    		elements[i] = Long.parseLong(reader.readLine());
	    	}
	    	long[] sums = new long[n];
	    	Arrays.sort(elements);
	    	for(int i=0;i<n;i++) {
	    		sums[i] = elements[i] * (n-i);
	    	}
	    	long max = sums[0];
	    	for(int i=1;i<n;i++) {
	    		if(sums[i] > max) {
	    			max = sums[i];
	    		}
	    	}
	    	System.out.println(max);
	    	
	    }
	    catch(Exception e){
	        return;
	    }
	}
}

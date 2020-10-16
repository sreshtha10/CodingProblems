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
	    	int test = Integer.parseInt(reader.readLine());
	    	while(test !=0) {
		    	int n = Integer.parseInt(reader.readLine());
		    	int[] arr = new int[n];
		    	StringTokenizer stringTokenizer =new StringTokenizer(reader.readLine());
		    	for(int i = 0;i<n;i++) {
		    		arr[i] = Integer.parseInt(stringTokenizer.nextToken());
		    	}
		    	int count = 1;
		    	int max_speed = arr[0];
		    	for(int i = 1;i<n;i++) {
		    		if(arr[i] < max_speed ) {
		    			count+=1;
		    			max_speed = arr[i];
		    		}
		    		
		    	}
		    	System.out.println(count);
		    	test -=1;
	    	}

	    	
	    }
	    catch(Exception e){
	        return;
	    }
	}
}

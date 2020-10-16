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
	        while(true){
	            int n = Integer.parseInt(reader.readLine());
	            if (n == 42) {
	            	break;
	            }
	            else {
	            	System.out.println(n);
	            }
	        }
	        reader.close();
	    }
	    catch(Exception e){
	        return;
	    }
	}
}

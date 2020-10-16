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
	    	while(test > 0) {
	    		int number = Integer.parseInt(reader.readLine());
	    		System.out.println(reverse(number,0));
	    		test -= 1;
	    	}
	    }
	    catch(Exception e){
	        return;
	    }
	}
	public static int reverse(int number,int s) {
		if(number == 0) {
			return s;
		}
		int y = number%10;
		s = s*10 + y;
		return reverse((int)number/10,s);
	}
}

/* Very Interesting problem. if the Q and I are same output will always be N//2 and if not it will be N-(N//2)*/

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
	    	long test = Long.parseLong(reader.readLine());
	    	while(test !=0) {
	    		long games = Long.parseLong(reader.readLine());
	    		while(games !=0) {
	    			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
	    			int init = Integer.parseInt(stringTokenizer.nextToken());
	    			long numberCoins = Long.parseLong(stringTokenizer.nextToken());
	    			int q = Integer.parseInt(stringTokenizer.nextToken());
	    			if(q == init) {
	    				System.out.println((int)numberCoins/2);
	    			}
	    			else {
	    				System.out.println(numberCoins-(int)numberCoins/2);
	    			}
	    			games -= 1;
	    		}
	    		test -=1;
	    	
	    	}

	    	
	    }
	    catch(Exception e){
	        return;
	    }
	}
}

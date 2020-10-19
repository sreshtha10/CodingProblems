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
	    	while(test != 0) {
	    		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
	    		int n = Integer.parseInt(stringTokenizer.nextToken());
	    		String optString = stringTokenizer.nextToken();
	    		int ladduCount = 0;
    			while(n>0) {
    				String nextString = reader.readLine();
    				StringTokenizer s1 = new StringTokenizer(nextString);
    				String optt = s1.nextToken();
    				int a = 0;
    				if(s1.hasMoreTokens()) {
    					a = Integer.parseInt(s1.nextToken());
    				}
    				switch (optt) {
					case "CONTEST_WON" : {
								if(a <=20) {
									ladduCount += (300+20-a);
								}
								else {
									ladduCount += 300;
								}
								
					}
					break;
					case "TOP_CONTRIBUTOR":{
						ladduCount += 300;
					}
					break;
					case "BUG_FOUND" :{
						ladduCount += a;
					}
					break;
					case "CONTEST_HOSTED":{
						ladduCount += 50;
					}
					break;
					}
    				n -= 1;
    			}
    			if(optString.equals("INDIAN")) {
    				System.out.println((int)ladduCount/200);
    			}
    			else {
    				System.out.println((int)ladduCount/400);
    			}
    			
	    		test -= 1;
	    	}
	    	reader.close();
	    	
	    }
	    catch(Exception e){
	        return;
	    }
	}
}
